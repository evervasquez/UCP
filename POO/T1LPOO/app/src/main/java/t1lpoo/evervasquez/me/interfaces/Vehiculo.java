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
package t1lpoo.evervasquez.me.interfaces;

/*
    SuperClass Vehiculo
 */
public class Vehiculo {

    private VehiculoInterface vehiculoInterface;


    public Vehiculo(Furgon vehiculoInterface) {
        this.vehiculoInterface = vehiculoInterface;
    }

    public String encender() {
        return this.vehiculoInterface.encender();
    }

    public String frenar() {
        return this.vehiculoInterface.frenar();
    }

    protected String acelerar() {
        return this.vehiculoInterface.acelerar();
    }

    public String retroceder() {
        return this.vehiculoInterface.retroceder();
    }

}
