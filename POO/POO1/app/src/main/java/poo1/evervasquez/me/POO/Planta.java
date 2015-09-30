/*
 *
 *  * Copyright (C) 2015 eveR Vásquez.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package poo1.evervasquez.me.POO;

import android.util.Log;

public class Planta {
    /**
     * atributos
     **/
    //declaración y asignación
    public String color;

    public String textura = "aspero";

    public String nombre;

    public int tamanio = 10;

    public Planta(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Planta()
    {
        this.nombre = "palta";
        this.color = "blanco";
        Log.v("Constructor","Inicializando variables...");
    }

    /**
     * Metodos
     *
     */

    protected String crecer() {
        return "estoy creciendo";
    }

    private String darFrutos() {
        return "estoy dando frutos";
    }

    private String morir() {
        return "estoy muerto";
    }

    public String fotosintesis() {
        return "estoy realizando la fotosintesis";
    }
}
