package com.example.dh_carrosapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Carro implements Parcelable {

    private int imagem;
    private String nome;

    public Carro (int imagem, String nome){
        this.imagem = imagem;
        this.nome = nome;
    }

    protected Carro(Parcel in) {
        nome = in.readString();
        imagem = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imagem);
        dest.writeString(nome);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Carro> CREATOR = new Creator<Carro>() {
        @Override
        public Carro createFromParcel(Parcel in) {
            return new Carro(in);
        }

        @Override
        public Carro[] newArray(int size) {
            return new Carro[size];
        }
    };

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
