import {Component, OnInit} from '@angular/core';
import {IUsers} from '../../../interfaces/i-users';
import {ActivatedRoute, Router} from '@angular/router';
import {Title} from '@angular/platform-browser';
import {CargaUserService} from '../../../servicios/user/carga-user.service';
import Swal from "sweetalert2";

@Component({
  selector: 'app-detalles-user',
  templateUrl: './detalles-user.component.html',
  styleUrls: ['./detalles-user.component.scss']
})

export class DetallesUserComponent implements OnInit {
  public user: IUsers;
  public idUser: number;

  constructor(private route: ActivatedRoute, private titleService: Title, private cargaUsers: CargaUserService, private router: Router) {
  }

  ngOnInit(): void {
    this.user = this.route.snapshot.data['user'];
    this.idUser = this.route.snapshot.params['id'];
    this.titleService.setTitle('Modificar usuario ' + this.idUser);
  }

  modificarUser(): void {
    this.cargaUsers.modificarUser(this.user).subscribe(
      e => {
        console.log('User ' + this.idUser + ' modificado');
        console.log(this.user);
        this.router.navigate(['/usuarios']);
      },
      error => {
        console.log(error);
      }
    );
  }
  executeExample() :void{
    const Toast = Swal.mixin({
      toast: true,
      position: 'top-end',
      showConfirmButton: false,
      timer: 2000,
      timerProgressBar: true,
      didOpen: (toast) => {
        toast.addEventListener('mouseenter', Swal.stopTimer)
        toast.addEventListener('mouseleave', Swal.resumeTimer)
      }
    })

    Toast.fire({
      icon: 'success',
      title: 'Usuario Modificada Correctamente'
    })

  }
}
