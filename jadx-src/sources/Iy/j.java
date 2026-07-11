package Iy;

import android.content.res.Resources;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import i.C2165Ml;
import i.C2169w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f4399n = new j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: Iy.j$j, reason: collision with other inner class name */
    public /* synthetic */ class C0149j extends FunctionReferenceImpl implements Function0 {
        C0149j(Object obj) {
            super(0, obj, j.class, "preferredLocales", "preferredLocales()Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return ((j) this.receiver).n();
        }
    }

    public static /* synthetic */ C2169w6 t(j jVar, C2165Ml c2165Ml, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function0 = new C0149j(jVar);
        }
        return jVar.rl(c2165Ml, function0);
    }

    public final C2169w6 rl(C2165Ml localizations, Function0 localesProvider) {
        C2169w6 c2169w6;
        Object next;
        Intrinsics.checkNotNullParameter(localizations, "localizations");
        Intrinsics.checkNotNullParameter(localesProvider, "localesProvider");
        Iterable iterable = (Iterable) localesProvider.invoke();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String languageTag = ((Locale) it.next()).toLanguageTag();
            if (languageTag != null) {
                arrayList.add(languageTag);
            }
        }
        Iterator it2 = arrayList.iterator();
        do {
            c2169w6 = null;
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            Iterator it3 = localizations.n().entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (StringsKt.startsWith(str, (String) ((Map.Entry) next).getKey(), true)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                c2169w6 = (C2169w6) entry.getValue();
            }
        } while (c2169w6 == null);
        return c2169w6;
    }

    private j() {
    }

    public final List n() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        LocaleListCompat localeListCompatN = ConfigurationCompat.n(Resources.getSystem().getConfiguration());
        int iKN = localeListCompatN.KN();
        for (int i2 = 0; i2 < iKN; i2++) {
            Locale localeNr = localeListCompatN.nr(i2);
            Intrinsics.checkNotNull(localeNr);
            listCreateListBuilder.add(localeNr);
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
