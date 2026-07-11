package androidx.preference;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class PreferenceDataStore {
    public boolean n(String str, boolean z2) {
        return z2;
    }

    public Set nr(String str, Set set) {
        return set;
    }

    public int rl(String str, int i2) {
        return i2;
    }

    public String t(String str, String str2) {
        return str2;
    }

    public void J2(String str, int i2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void KN(String str, Set set) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void O(String str, boolean z2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void Uo(String str, String str2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
}
