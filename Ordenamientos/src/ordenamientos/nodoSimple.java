/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientos;
class nodoSimple {
 private String dato;
 private nodoSimple enlace;
 nodoSimple( String d ) {
 this( d, null );
 }
 nodoSimple( String d, nodoSimple e ) {
 dato = d;
 enlace = e;
 }
 String getDato() {
 return dato;
 }
 nodoSimple getEnlace() {
 return enlace;
 }
 void setDato(String d) {
 dato = d;
 }

 void setEnlace(nodoSimple e) {
 enlace = e;
 }
}