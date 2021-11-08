#language:es
@utest
  Característica: registro en utest
    para poder utilizar utest
    como usuario hay que registrarse

  Escenario: : Daniel esta registrado con exito
    Dado que Daniel esta en el formulario de inscripcion
    Cuando rellene todos los pasos del registro
    Entonces valida el titulo que sea igual a The last step

