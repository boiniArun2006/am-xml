package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import bA.C1653C;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Xo extends iwV {
    static byte[] Uo(String str) {
        Hh.C.rl(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int iIndexOf = str.indexOf(44);
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        if (KN(str.substring(0, iIndexOf))) {
            return Base64.decode(strSubstring, 0);
        }
        String strDecode = Uri.decode(strSubstring);
        Hh.C.Uo(strDecode);
        return strDecode.getBytes();
    }

    static boolean KN(String str) {
        if (!str.contains(";")) {
            return false;
        }
        return str.split(";")[r2.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected String J2() {
        return "DataFetchProducer";
    }

    public Xo(A72.fuX fux) {
        super(Gs.j.n(), fux);
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected C1653C nr(com.facebook.imagepipeline.request.j jVar) {
        byte[] bArrUo = Uo(jVar.WPU().toString());
        return t(new ByteArrayInputStream(bArrUo), bArrUo.length);
    }
}
