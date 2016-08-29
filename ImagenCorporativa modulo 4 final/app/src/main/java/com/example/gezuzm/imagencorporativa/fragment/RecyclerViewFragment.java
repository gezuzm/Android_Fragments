package com.example.gezuzm.imagencorporativa.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.gezuzm.imagencorporativa.R;
import com.example.gezuzm.imagencorporativa.adapter.MascotaAdaptador;
import com.example.gezuzm.imagencorporativa.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by mauricio on 28/08/16.
 */
// clase creada manualmente
public class RecyclerViewFragment extends Fragment {


    ArrayList<Mascota> arrayMascotas;
    private RecyclerView listaMascotas;     // para usarse como recurso local

    // sobreescrito se creo manual
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // equivale al setcontentview
        // asocia la clase a la vista v es el layout ahora
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false );

        //asignar la referencia del recurso al recurso local
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        // declara un linearloyout para un mejor acomodo del RecyclerView
        LinearLayoutManager llMascotas = new LinearLayoutManager(getActivity());
        llMascotas.setOrientation(LinearLayout.VERTICAL); // requisito
        listaMascotas.setLayoutManager(llMascotas); // asignarlo al RecyclerView

        // de la clase mascotas
        InicializarListaMascotas();
        // iniciar el adaptador, es necesario para poder usar el RecyclerView
        inicializarAdaptador();



         return v;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }


    private void InicializarListaMascotas() {
        // es nercesario tener una clase
        arrayMascotas = new ArrayList<Mascota>();

        arrayMascotas.add(new Mascota(R.drawable.el_escarador, "Escalador"));
        arrayMascotas.add(new Mascota(R.drawable.cochino_jabato, "Jabato"));
        arrayMascotas.add(new Mascota(R.drawable.feanor, "Feanor"));
        arrayMascotas.add(new Mascota(R.drawable.golden_dragoone, "Drago"));
        arrayMascotas.add(new Mascota(R.drawable.kuaku_, "Kuaku"));
        arrayMascotas.add(new Mascota(R.drawable.nomoon, "Nonito"));
        arrayMascotas.add(new Mascota(R.drawable.pekefux, "Pekefux"));
        arrayMascotas.add(new Mascota(R.drawable.tortuga, "Tortu"));
        arrayMascotas.add(new Mascota(R.drawable.miaumiua_atigrado, "Miaumiau"));
    }


    private void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(arrayMascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

}
