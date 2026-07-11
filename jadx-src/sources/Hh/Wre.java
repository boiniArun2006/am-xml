package Hh;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Wre extends ArrayList {
    public static Wre rl(Object... objArr) {
        Wre wre = new Wre(objArr.length);
        Collections.addAll(wre, objArr);
        return wre;
    }

    private Wre(int i2) {
        super(i2);
    }
}
