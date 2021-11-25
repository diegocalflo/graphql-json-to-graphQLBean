package mx.com.exos.technology;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String sb = "";
        String json = "{\n" +
                "  adquirente: Adquirente\n" +
                "  banderaCashback: String\n" +
                "  banderaTarjetaPresente: String\n" +
                "  bin: String\n" +
                "  binCorto: String\n" +
                "  codEnvioAbono: String\n" +
                "  codError: ValueLabel\n" +
                "  codGiro: String\n" +
                "  codIndicadorComercioElectronico: String\n" +
                "  codIntercambio: String\n" +
                "  codMedioAcceso: String\n" +
                "  codModoEntradaPos: String\n" +
                "  codNaturalezaBin: String\n" +
                "  codProcesoEmisor: String\n" +
                "  codRiesgo: ValueLabel\n" +
                "  codTipoAbono: String\n" +
                "  codTipoMoneda: String\n" +
                "  codTipoProducto: String\n" +
                "  codTipoPromocion: String\n" +
                "  codTipoTarjeta: String\n" +
                "  codTipoTransaccion: String\n" +
                "  cuotaDescuento: String\n" +
                "  diferimientoPromocion: String\n" +
                "  dispatcher: String\n" +
                "  emisor: Emisor\n" +
                "  fhArchivo: String\n" +
                "  fhDeposito: String\n" +
                "  fhProceso: String\n" +
                "  fhTransaccion: String\n" +
                "  fhUltimaModificacion: String\n" +
                "  hrTransaccion: String\n" +
                "  idCategoriaVenta: Int\n" +
                "  idLotes: ID\n" +
                "  idPlataformaLog: String\n" +
                "  idTransaccion: String\n" +
                "  importeCashback: Int\n" +
                "  importeIvaTasaDescuento: Int\n" +
                "  importePropina: Int\n" +
                "  importeTasaDescuento: Int\n" +
                "  importeTransaccion: Int\n" +
                "  llavePos: String\n" +
                "  numeroAfiliacion: String\n" +
                "  numeroAutorizacion: String\n" +
                "  numeroCuenta: String\n" +
                "  numeroHorasDeposito: String\n" +
                "  numeroLote: Int\n" +
                "  numeroReferenciaRrn: String\n" +
                "  numeroVentana: Int\n" +
                "  parcializacioPromocion: String\n" +
                "  plataforma: ValueLabel\n" +
                "  procesoUltimaModificacion: String\n" +
                "  referenciaCheques: String\n" +
                "  referenciaIntercambio: String\n" +
                "  registroLlaveLog: String\n" +
                "  reproceso: String\n" +
                "  tasaDescuento: String\n" +
                "  terminacionCuenta: String\n" +
                "  terminalData: String\n" +
                "  tipoAbonoComercio: String\n" +
                "  tipoIntercambio: String\n" +
                "  tipoTransaccion: ValueLabel\n" +
                "  afiliacion: Afiliacion\n" +
                "}";

        for (int i = 0; i < json.length(); i ++){
            char c = json.charAt(i);
            List<Character> chars = Arrays.asList(c);

            for (Character ch : chars) {
                if (!ch.equals(':') && !ch.equals('}') && !ch.equals('{')){
                    sb = sb + ch;
                }
            }

        }



        String[] array = sb.split("\\r?\\n");

        for (int i = array.length -1; i > 0; i--){
            String[] result = array[i].split("\\s+");

            System.out.println("GraphQlData('"+result[1]+"')");
            System.out.println("private " + result[2] + " " + result[1]);

        }

    }
}
