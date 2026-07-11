package stX;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class qz {

    static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f73379n = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Dsr it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return "position " + it.rl() + ": '" + ((String) it.n().invoke()) + '\'';
        }
    }

    private static final eO nr(eO eOVar, List list) {
        List listListOf;
        ArrayList arrayList = new ArrayList();
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        List mutableList2 = null;
        for (Pl pl : eOVar.rl()) {
            if (pl instanceof fuX) {
                if (mutableList2 != null) {
                    mutableList2.addAll(((fuX) pl).t());
                } else {
                    mutableList2 = CollectionsKt.toMutableList((Collection) ((fuX) pl).t());
                }
            } else if (pl instanceof C2365c) {
                mutableList.add(pl);
            } else {
                if (mutableList2 != null) {
                    arrayList.add(new fuX(mutableList2));
                    mutableList2 = null;
                }
                arrayList.add(pl);
            }
        }
        List listN = eOVar.n();
        List<eO> arrayList2 = new ArrayList();
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            eO eOVarNr = nr((eO) it.next(), mutableList);
            if (eOVarNr.rl().isEmpty()) {
                listListOf = eOVarNr.n();
                if (listListOf.isEmpty()) {
                    listListOf = CollectionsKt.listOf(eOVarNr);
                }
            } else {
                listListOf = CollectionsKt.listOf(eOVarNr);
            }
            CollectionsKt.addAll(arrayList2, listListOf);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = CollectionsKt.listOf(new eO(mutableList, CollectionsKt.emptyList()));
        }
        if (mutableList2 == null) {
            return new eO(arrayList, arrayList2);
        }
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Pl pl3 = (Pl) CollectionsKt.firstOrNull(((eO) it2.next()).rl());
                if (pl3 != null && (pl3 instanceof fuX)) {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    for (eO eOVar2 : arrayList2) {
                        Pl pl4 = (Pl) CollectionsKt.firstOrNull(eOVar2.rl());
                        arrayList3.add(pl4 instanceof fuX ? new eO(CollectionsKt.plus((Collection) CollectionsKt.listOf(new fuX(CollectionsKt.plus((Collection) mutableList2, (Iterable) ((fuX) pl4).t()))), (Iterable) CollectionsKt.drop(eOVar2.rl(), 1)), eOVar2.n()) : pl4 == null ? new eO(CollectionsKt.listOf(new fuX(mutableList2)), eOVar2.n()) : new eO(CollectionsKt.plus((Collection) CollectionsKt.listOf(new fuX(mutableList2)), (Iterable) eOVar2.rl()), eOVar2.n()));
                    }
                    return new eO(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new fuX(mutableList2));
        return new eO(arrayList, arrayList2);
    }

    public static final eO rl(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        eO eOVar = new eO(CollectionsKt.emptyList(), CollectionsKt.emptyList());
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                eOVar = t((eO) listIterator.previous(), eOVar);
            }
        }
        return nr(eOVar, CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(List list) {
        if (list.size() == 1) {
            return "Position " + ((Dsr) list.get(0)).rl() + ": " + ((String) ((Dsr) list.get(0)).n().invoke());
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(list, new StringBuilder(list.size() * 33), (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 2) != 0 ? ", " : ", ", (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 4) != 0 ? "" : "Errors: ", (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 8) == 0 ? null : "", (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 16) != 0 ? -1 : 0, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 32) != 0 ? "..." : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 64) != 0 ? null : j.f73379n)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final eO t(eO eOVar, eO eOVar2) {
        if (eOVar.n().isEmpty()) {
            return new eO(CollectionsKt.plus((Collection) eOVar.rl(), (Iterable) eOVar2.rl()), eOVar2.n());
        }
        List listRl = eOVar.rl();
        List listN = eOVar.n();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(t((eO) it.next(), eOVar2));
        }
        return new eO(listRl, arrayList);
    }
}
