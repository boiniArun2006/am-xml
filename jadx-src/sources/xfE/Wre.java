package xfE;

import java.util.Collection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface Wre {

    public interface j {
        String getId();

        long getSize();

        long n();
    }

    public interface n {
        com.facebook.binaryresource.j n(Object obj);

        void rl(lN.Dsr dsr, Object obj);

        boolean t();
    }

    com.facebook.binaryresource.j O(String str, Object obj);

    Collection getEntries();

    boolean isExternal();

    void n();

    long nr(j jVar);

    long remove(String str);

    boolean rl(String str, Object obj);

    n t(String str, Object obj);
}
