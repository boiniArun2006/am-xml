package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
final class LocaleListPlatformWrapper implements LocaleListInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LocaleList f36537n;

    public boolean equals(Object obj) {
        return this.f36537n.equals(((LocaleListInterface) obj).rl());
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i2) {
        return this.f36537n.get(i2);
    }

    public int hashCode() {
        return this.f36537n.hashCode();
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        return this.f36537n.isEmpty();
    }

    @Override // androidx.core.os.LocaleListInterface
    public String n() {
        return this.f36537n.toLanguageTags();
    }

    @Override // androidx.core.os.LocaleListInterface
    public Object rl() {
        return this.f36537n;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
        return this.f36537n.size();
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale t(String[] strArr) {
        return this.f36537n.getFirstMatch(strArr);
    }

    public String toString() {
        return this.f36537n.toString();
    }

    LocaleListPlatformWrapper(Object obj) {
        this.f36537n = (LocaleList) obj;
    }
}
