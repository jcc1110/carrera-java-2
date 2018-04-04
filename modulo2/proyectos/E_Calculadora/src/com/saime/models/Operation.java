package com.saime.models;
import com.saime.structures.DivisionZeroException;
import com.saime.structures.OperationAbstract;

/**
 * Operaciones para la calculadora
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class Operation extends OperationAbstract {
    @Override
    public int sumar() {
        return super.getOne() + super.getTwo();
    }

    @Override
    public int restar() {
        return super.getOne() - super.getTwo();
    }

    @Override
    public int multiplicar() {
        return super.getOne() * super.getTwo();
    }

    @Override
    public int dividir() throws DivisionZeroException {
        // Validando el origen de nuestra excepción
        if (super.getTwo() == 0) {
            throw new DivisionZeroException("No se puede realizar la operación con un valor cero, por favor intente con un valor diferente.");
        }
        return super.getOne() / super.getTwo();
    }
}
