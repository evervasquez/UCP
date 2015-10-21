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
package t1lpoo.evervasquez.me.herencia;

/*
    SuperClass Vehiculo
 */
public class Vehiculo {
    public String linea;
    public String color;
    public String marca;
    public String modelo;
    protected String placa = "A32-122";


    public String encender() {
        return "Encendiendo vehiculo";
    }

    public String frenar() {
        return "Deteniendo vehiculo";
    }

    protected String acelerar() {
        return "Acelerando vehiculo";
    }

    public String retroceder() {
        return "Retrocediendo vehiculo";
    }

    public String apagar() {
        return "Apagando vehiculo";
    }
}
