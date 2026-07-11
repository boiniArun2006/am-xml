package androidx.compose.runtime;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\"\u0010\u000bR$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0011\u0010%\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010 \u0088\u0001\u0005\u0092\u0001\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¨\u0006&"}, d2 = {"Landroidx/compose/runtime/Stack;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "backing", "rl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "value", "", "qie", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "gh", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "xMQ", "", "index", "mUb", "(Ljava/util/ArrayList;I)Ljava/lang/Object;", "Uo", "(Ljava/util/ArrayList;)Z", "KN", "", c.f62177j, "(Ljava/util/ArrayList;)V", "", "az", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "", "ty", "(Ljava/util/ArrayList;)Ljava/lang/String;", "J2", "(Ljava/util/ArrayList;)I", InneractiveMediationNameConsts.OTHER, "nr", "Ljava/util/ArrayList;", "O", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Stack<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ArrayList backing;

    public static int J2(ArrayList arrayList) {
        return arrayList.hashCode();
    }

    public static boolean nr(ArrayList arrayList, Object obj) {
        return (obj instanceof Stack) && Intrinsics.areEqual(arrayList, ((Stack) obj).getBacking());
    }

    public static ArrayList rl(ArrayList arrayList) {
        return arrayList;
    }

    public static String ty(ArrayList arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final /* synthetic */ ArrayList getBacking() {
        return this.backing;
    }

    public boolean equals(Object obj) {
        return nr(this.backing, obj);
    }

    public int hashCode() {
        return J2(this.backing);
    }

    public String toString() {
        return ty(this.backing);
    }

    public static /* synthetic */ ArrayList t(ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return rl(arrayList);
    }

    public static final boolean KN(ArrayList arrayList) {
        return !Uo(arrayList);
    }

    public static final int O(ArrayList arrayList) {
        return arrayList.size();
    }

    public static final boolean Uo(ArrayList arrayList) {
        return arrayList.isEmpty();
    }

    public static final Object[] az(ArrayList arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        return objArr;
    }

    public static final Object gh(ArrayList arrayList) {
        return arrayList.remove(O(arrayList) - 1);
    }

    public static final Object mUb(ArrayList arrayList, int i2) {
        return arrayList.get(i2);
    }

    public static final void n(ArrayList arrayList) {
        arrayList.clear();
    }

    public static final boolean qie(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }

    public static final Object xMQ(ArrayList arrayList) {
        return arrayList.get(O(arrayList) - 1);
    }
}
