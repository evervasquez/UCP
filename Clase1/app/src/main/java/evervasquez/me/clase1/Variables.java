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
package evervasquez.me.clase1;

import java.util.Date;

public class Variables {

    /*

    Tipo de datos
    ===========================

    SQL                  Java

    1. varchar          1. String
    2. Integer          2. Integer
    3. date             3. Date
    4. datetime         4. DateTime
    5. text             5. String
    6. decimal          6. Float / Double
    7. char             7. Char
     */

    /*
        Variables                               CamelCase
        ----------
        1. Declarar variables                   ejemplo : TelefonoAmigo
        2. Instanciar variables                           telefonoMejorAmigo
        3. Asignar variables

     */

    //declarar variable
    //String MiDireccion;

    //instanciamos
    String MiDireccion = "Jr. Martines #546";

    int Edad = 21;

    int Cantidad = 2;

    Date FechaIngreso = new Date("2015-08-26");

    float Precio = Float.parseFloat("32.2");

    double Precio2 = 23.4;

    public String miFunction(){

        //MiDireccion = "Jr. Martines #546";
        Edad = 23;
        return  MiDireccion;
    }

    public double multiplicacion(){
        return Cantidad * Precio2;
    }
}
