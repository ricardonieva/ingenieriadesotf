
package Controlador;

import Modelo.*;
import java.util.ArrayList;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfCiudadSvc;
import org.tempuri.IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage;

public class Agencia {

  private ArrayList<Ciudad> Ciudades = new ArrayList();
  private ArrayList<Paquete> paquetes = new ArrayList();

    public Agencia() {
        try {
            String codigo = "2b2fcf56-9e76-4537-b624-e5146db5da20";
            ArrayOfCiudadSvc listaciudades = obtenerCiudades(codigo);

            System.out.println("Codigo\tCiudad");
            System.out.println("======\t======");
            for(int i=0;i<listaciudades.getCiudadSvc().size();i++) {
//                System.out.print("["+listaciudades.getCiudadSvc().get(i).getCodigo()+"]\t");
//                System.out.println("   "+listaciudades.getCiudadSvc().get(i).getDescripcion().getValue());

                Ciudad c = new Ciudad(listaciudades.getCiudadSvc().get(i).getCodigo(), listaciudades.getCiudadSvc().get(i).getDescripcion().getValue());
                Ciudades.add(c);
            }
        } catch (IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage ex) {
            ex.printStackTrace();
        }
           
    }
    
    private static ArrayOfCiudadSvc obtenerCiudades(java.lang.String codigo) throws IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage {
        org.tempuri.BusService service = new org.tempuri.BusService();
        org.tempuri.IBusService port = service.getSGEBusService();
        return port.obtenerCiudades(codigo);
    }

    public ArrayList<Ciudad> getCiudades() {
        return Ciudades;
    }
    public void setCiudades(ArrayList<Ciudad> Ciudades) {
        this.Ciudades = Ciudades;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }


}
