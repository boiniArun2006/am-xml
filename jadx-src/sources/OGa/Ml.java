package OGa;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public @interface Ml {

    public enum j {
        DEFAULT,
        SIGNED,
        FIXED
    }

    j intEncoding() default j.DEFAULT;

    int tag();
}
