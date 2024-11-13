package com.bekvizz.sudokugame;

public class Matrices {
    private final int rows;
    private final int columns;
    private final int[][] matrix;

    public Matrices(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int[] i : matrix) {
            for (int j : i) {
                builder.append(j).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public void fillMatrix(int num) {
        if (num == 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = i + j;
                }
            }
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = num;
                }
            }
        }
    }

    public int[] getRow(int rowIndex) {
        int[] temp = new int[rows];
        for (int i = 0; i < matrix.length; i++) {
            temp[i] = matrix[rowIndex - 1][i];
        }
        return temp;
    }

    public int[] getColumn(int columnIndex) {
        int[] temp = new int[columns];
        for (int i = 0; i < matrix.length; i++) {
            temp[i] = matrix[columnIndex - 1][i];
        }
        return temp;
    }
}
