package com.saime.structures;

/**
 * Definición de los atributos y métodos a utilizar
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public abstract class OperationAbstract {
    /**
     * Número uno
     */
    private int one;
    
    /**
     * Número dos
     */
    private int two;
    
    /**
     * Operador para identificar la operación, pueden ser:
     * 1: para sumar
     * 2: para restar
     * 3: para multiplicar
     * 4: para dividir
     */
    private int operator;
    
    /**
     * Método que realiza la suma de dos números
     * @return int resultado de la operación
     */
    public abstract int sumar();
    
    /**
     * Método que realiza la resta de dos números
     * @return int resultado de la operación
     */
    public abstract int restar();
    
    /**
     * Método que realiza la mulplicación de dos números
     * @return int resultado de la operación
     */
    public abstract int multiplicar();
    
    /**
     * Método que realiza la división de dos números
     * @return int resultado de la operación
     * @throws com.saime.structures.DivisionZeroException División entre cero
     */
    public abstract int dividir() throws DivisionZeroException;

    /**
     * Obtener el valor "one"
     * @return int Valor de "one"
     */
    public int getOne() {
        return one;
    }

    /**
     * Establecer el valor "one"
     * @param one Valor a establecer
     */
    public void setOne(int one) {
        this.one = one;
    }

    /**
     * Obtener el valor "two"
     * @return int Valor de "two"
     */
    public int getTwo() {
        return two;
    }

    /**
     * Establecer el valor "two"
     * @param two Valor a establecer
     */
    public void setTwo(int two) {
        this.two = two;
    }

    /**
     * Obtener el valor "operator"
     * @return int Valor de "operator"
     */
    public int getOperator() {
        return operator;
    }

    /**
     * Establecer el valor operator
     * @param operator Valor a establecer
     */
    public void setOperator(int operator) {
        this.operator = operator;
    }
}
