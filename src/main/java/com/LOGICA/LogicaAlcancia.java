/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.LOGICA;

/**
 *
 * @author OTALVARO-MEZA
 */
public class LogicaAlcancia {
    
    
    //SE DECLARAN LAS VARIABLES DONDE SE ALMACENARAN LAS CANTIDADES DE LAS MONEDAS INSERTADAS
    private int Cincuenta=0;
    private int Cien=0;
    private int Docientos=0;
    private int Quinientos=0;
    private int Mil=0;
    
    
   // SE DECLARA LA FUNCION QUE PERMITE LA INSERCION DE MONEDAS POR DENOMINACIONES
   // EN LAS VARIABLES
    public void InsertarMoneda(int Denominacion){
         switch(Denominacion){
            case 50 :{Cincuenta=Cincuenta+50; break;}
            case 100 :{Cien=Cien+100;break;}
            case 200 :{Docientos=Docientos+200;break;}
            case 500 :{Quinientos=Quinientos+500;break;}
            case 1000 :{Mil=Mil+1000;break;}
            default :{break;}
        };
    };
   
    
    //FUNCION QUE PERMITE CALCULAR EL TOTAL DE DINERO AHORRADO POR DENOMINACION
    public int TotalDineroPorDenominacion(int denominacion){ 
        int Total=0;
         switch(denominacion){
            case 50 :{Total= Cincuenta;break;}
            case 100 :{Total=Cien;break;}
            case 200 :{Total=Docientos;break;}
            case 500 :{Total=Quinientos;break;}
            case 1000 :{Total=Mil;break;}
            default :{break;}
        };
        return Total;
    };
    
    
    //FUNCION QUE CALCULA EL NUMERO DE MONEDAS INGRESADAS A LA ALCANCIA POR 
    //DENOMINACION
     public int CantidadDeMonedasPorDenominacion(int denominacion){ 
        int Cantidad=0;
         switch(denominacion){
            case 50 :{Cantidad= Cincuenta/50;break;}
            case 100 :{Cantidad=Cien/100;break;}
            case 200 :{Cantidad=Docientos/200;break;}
            case 500 :{Cantidad=Quinientos/500;break;}
            case 1000 :{Cantidad=Mil/1000;break;}
            default :{break;}
        };
        return Cantidad;
    };
     
     
     //FUNCION QUE PERMITE CALCULAR EL TOTAL DE DINERO AHORRADO EN LA ALCANCIA
     public int TotalAlcancia(){
         int  TotalAlcancia=Cincuenta+Cien+Docientos+Quinientos+Mil;         
         return TotalAlcancia; 
    }
     
     //FUNCION QUE PERMITE CALCULAR EL TOTAL DE DINERO AHORRADO EN LA ALCANCIA
     public int CantidadMonedas(){
         int  CantidadMonedas=(Cincuenta/50)+(Cien/100)+(Docientos/200)+(Quinientos/500)+(Mil/1000);
         return CantidadMonedas;
    }
    
    
}
