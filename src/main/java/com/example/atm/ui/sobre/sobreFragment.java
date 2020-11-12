package com.example.atm.ui.sobre;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atm.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class sobreFragment extends Fragment {


    public sobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "A ATM consultoria tem como missão apoiar organizações" +
                            "que desejam alcançar através da excelência em gestão e " +
                             "da busca pela qualidade";

        Element versao = new Element();
        versao.setTitle("versão 1.4");

    return new AboutPage(getActivity(  ))
                .setImage( R.drawable.logo )
                .setDescription( descricao )
                .addGroup("entre em contato")
                .addEmail("leo@gmail.com","envie um e-mail")
                .addWebsite("www.leo.com","acesse nosso site.")
                .addGroup("redes sociais")
                .addFacebook("Leo Sousa","facebook")
                .addInstagram("Leozin","instagram")
                .addGitHub("https://github.com/medyo/android-about-page","github")
                .addItem( versao )
                .create();
    }
}
