import { TestBed } from '@angular/core/testing';

import {CargaPacienteService} from "./carga-paciente.service";

describe('CargaPacienteService', () => {
  let service: CargaPacienteService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CargaPacienteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
