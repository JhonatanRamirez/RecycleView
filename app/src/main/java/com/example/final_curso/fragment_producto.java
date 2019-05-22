package com.example.final_curso;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.final_curso.Adapter.producto_adapter;
import com.example.final_curso.Entidades.Producto_entidad;

import java.util.ArrayList;

public class fragment_producto extends Fragment {

    int valorLlegada;
    ArrayList<Producto_entidad> arrayProducto;
    RecyclerView recyclerProducto;

    public fragment_producto() {
    }

    @SuppressLint("ValidFragment")
    public fragment_producto(int valorLlegada) {
        this.valorLlegada = valorLlegada;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.consultar_producto, container, false);

        arrayProducto= new ArrayList<>();
        recyclerProducto=view.findViewById(R.id.id_recyclerprod);
        recyclerProducto.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerProducto.setHasFixedSize(true);
        pasar();
        return  view;

    }

    private void pasar(){

        Producto_entidad p1 = new Producto_entidad();
        Producto_entidad p2 = new Producto_entidad();
        Producto_entidad p3 = new Producto_entidad();

        if(valorLlegada==1){
            p1.setNombre("camisaaa");
            p1.setDescripcion("Camisa polo para caballeroaaa");
            arrayProducto.add(p1);


            p2.setNombre("Pantalon");
            p2.setDescripcion("Pantalon para caballero color negro");
            arrayProducto.add(p2);


            p3.setNombre("Zapato");
            p3.setDescripcion("Zapatos converse para toda ocacion");
            arrayProducto.add(p3);
        }else{
            p1.setNombre("Chaqueta");
            p1.setDescripcion("chaqueta negra para caballero");
            arrayProducto.add(p1);

            p2.setNombre("correa");
            p2.setDescripcion("Correa de piela de cocodrilo");
            arrayProducto.add(p2);

            p3.setNombre("Buffanda");
            p3.setDescripcion("Buffanda multicolor calida para invierno");
            arrayProducto.add(p3);
        }

        producto_adapter adapter = new producto_adapter(arrayProducto);
        recyclerProducto.setAdapter(adapter);

    }
}
