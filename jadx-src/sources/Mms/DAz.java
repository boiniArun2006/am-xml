package Mms;

import EJn.Pl;
import EJn.Xo;
import Mms.ci;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class DAz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ci.j f6683n = new ci.j();
    private static final ci.j rl = new ci.j();

    public static final String KN(EJn.Wre wre, kotlinx.serialization.json.n json, int i2) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        ty(wre, json);
        return wre.O(i2);
    }

    public static final Map O(final kotlinx.serialization.json.n nVar, final EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) kotlinx.serialization.json.lej.n(nVar).rl(descriptor, f6683n, new Function0() { // from class: Mms.nKK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DAz.J2(descriptor, nVar);
            }
        });
    }

    public static final ci.j Uo() {
        return f6683n;
    }

    public static final boolean az(EJn.Wre wre, kotlinx.serialization.json.n json) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (json.O().gh()) {
            return true;
        }
        List annotations = wre.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof kotlinx.serialization.json.s4) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int gh(EJn.Wre wre, kotlinx.serialization.json.n nVar, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return mUb(wre, nVar, str, str2);
    }

    public static final int mUb(EJn.Wre wre, kotlinx.serialization.json.n json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int iXMQ = xMQ(wre, json, name);
        if (iXMQ != -3) {
            return iXMQ;
        }
        throw new SerializationException(wre.KN() + " does not contain element with name '" + name + '\'' + suffix);
    }

    private static final Map rl(EJn.Wre wre, kotlinx.serialization.json.n nVar) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zNr = nr(nVar, wre);
        ty(wre, nVar);
        int iNr = wre.nr();
        for (int i2 = 0; i2 < iNr; i2++) {
            List listJ2 = wre.J2(i2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ2) {
                if (obj instanceof kotlinx.serialization.json.ci) {
                    arrayList.add(obj);
                }
            }
            kotlinx.serialization.json.ci ciVar = (kotlinx.serialization.json.ci) CollectionsKt.singleOrNull((List) arrayList);
            if (ciVar != null && (strArrNames = ciVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zNr) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    }
                    t(linkedHashMap, wre, lowerCase2, i2);
                }
            }
            if (zNr) {
                lowerCase = wre.O(i2).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                t(linkedHashMap, wre, lowerCase, i2);
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.emptyMap() : linkedHashMap;
    }

    public static final kotlinx.serialization.json.g9s ty(EJn.Wre wre, kotlinx.serialization.json.n json) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(wre.getKind(), Xo.j.f2283n)) {
            json.O().qie();
        }
        return null;
    }

    public static final int xMQ(EJn.Wre wre, kotlinx.serialization.json.n json, String name) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        if (nr(json, wre)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return qie(wre, json, lowerCase);
        }
        ty(wre, json);
        int iT = wre.t(name);
        return (iT == -3 && json.O().HI()) ? qie(wre, json, name) : iT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map J2(EJn.Wre wre, kotlinx.serialization.json.n nVar) {
        return rl(wre, nVar);
    }

    private static final boolean nr(kotlinx.serialization.json.n nVar, EJn.Wre wre) {
        if (nVar.O().KN() && Intrinsics.areEqual(wre.getKind(), Pl.n.f2281n)) {
            return true;
        }
        return false;
    }

    private static final int qie(EJn.Wre wre, kotlinx.serialization.json.n nVar, String str) {
        Integer num = (Integer) O(nVar, wre).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private static final void t(Map map, EJn.Wre wre, String str, int i2) {
        String str2;
        if (Intrinsics.areEqual(wre.getKind(), Pl.n.f2281n)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i2));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + wre.O(i2) + " is already one of the names for " + str2 + ' ' + wre.O(((Number) MapsKt.getValue(map, str)).intValue()) + " in " + wre);
    }
}
