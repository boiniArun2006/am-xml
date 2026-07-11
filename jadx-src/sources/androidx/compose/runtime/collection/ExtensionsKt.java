package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/collection/ObjectList;", "Landroidx/collection/MutableObjectList;", "O", "(Landroidx/collection/ObjectList;)Landroidx/collection/MutableObjectList;", "", "K", "Lkotlin/Function1;", "selector", "nr", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectList;", "", c.f62177j, "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Z", "", "t", "(Landroidx/collection/MutableObjectList;Lkotlin/jvm/functions/Function1;)V", "rl", "(Landroidx/collection/MutableObjectList;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n36#1:80\n37#1:87\n287#2,4:73\n292#2:79\n287#2,6:81\n287#2,4:88\n292#2:94\n287#2,6:95\n287#2,4:101\n292#2:107\n919#3,2:77\n919#3,2:92\n919#3,2:105\n1#4:108\n1002#5,2:109\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n*L\n29#1:80\n29#1:87\n24#1:73,4\n24#1:79\n29#1:81,6\n31#1:88,4\n31#1:94\n36#1:95,6\n42#1:101,4\n42#1:107\n24#1:77,2\n31#1:92,2\n42#1:105,2\n64#1:109,2\n*E\n"})
public final class ExtensionsKt {
    public static final MutableObjectList O(ObjectList objectList) {
        MutableObjectList mutableObjectList = new MutableObjectList(objectList.get_size());
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            mutableObjectList.ty(objArr[i3]);
        }
        return mutableObjectList;
    }

    public static final boolean n(ObjectList objectList, Function1 function1) {
        if (objectList.get_size() <= 1) {
            return true;
        }
        Comparable comparable = (Comparable) function1.invoke(objectList.nr(0));
        if (comparable == null) {
            return false;
        }
        int i2 = objectList.get_size();
        int i3 = 1;
        while (i3 < i2) {
            Comparable comparable2 = (Comparable) function1.invoke(objectList.nr(i3));
            if (comparable2 == null || comparable.compareTo(comparable2) > 0) {
                return false;
            }
            i3++;
            comparable = comparable2;
        }
        return true;
    }

    public static final ObjectList nr(ObjectList objectList, Function1 function1) {
        if (n(objectList, function1)) {
            return objectList;
        }
        MutableObjectList mutableObjectListO = O(objectList);
        t(mutableObjectListO, function1);
        return mutableObjectListO;
    }

    public static final Object rl(MutableObjectList mutableObjectList) {
        if (!mutableObjectList.Uo()) {
            int i2 = mutableObjectList.get_size() - 1;
            Object objNr = mutableObjectList.nr(i2);
            mutableObjectList.g(i2);
            return objNr;
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final void t(MutableObjectList mutableObjectList, final Function1 function1) {
        List listO = mutableObjectList.o();
        if (listO.size() > 1) {
            CollectionsKt.sortWith(listO, new Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Function1 function12 = function1;
                    return ComparisonsKt.compareValues((Comparable) function12.invoke(obj), (Comparable) function12.invoke(obj2));
                }
            });
        }
    }
}
