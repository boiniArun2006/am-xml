package androidx.room.util;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/util/FtsTableInfo;", "", InneractiveMediationNameConsts.OTHER, "", c.f62177j, "(Landroidx/room/util/FtsTableInfo;Ljava/lang/Object;)Z", "", "rl", "(Landroidx/room/util/FtsTableInfo;)I", "", "t", "(Landroidx/room/util/FtsTableInfo;)Ljava/lang/String;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FtsTableInfoKt {
    public static final boolean n(FtsTableInfo ftsTableInfo, Object obj) {
        Intrinsics.checkNotNullParameter(ftsTableInfo, "<this>");
        if (ftsTableInfo == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo2 = (FtsTableInfo) obj;
        if (Intrinsics.areEqual(ftsTableInfo.name, ftsTableInfo2.name) && Intrinsics.areEqual(ftsTableInfo.columns, ftsTableInfo2.columns)) {
            return Intrinsics.areEqual(ftsTableInfo.options, ftsTableInfo2.options);
        }
        return false;
    }

    public static final int rl(FtsTableInfo ftsTableInfo) {
        Intrinsics.checkNotNullParameter(ftsTableInfo, "<this>");
        return (((ftsTableInfo.name.hashCode() * 31) + ftsTableInfo.columns.hashCode()) * 31) + ftsTableInfo.options.hashCode();
    }

    public static final String t(FtsTableInfo ftsTableInfo) {
        Intrinsics.checkNotNullParameter(ftsTableInfo, "<this>");
        return StringsKt.trimMargin$default("\n            |FtsTableInfo {\n            |   name = '" + ftsTableInfo.name + "',\n            |   columns = {" + TableInfoKt.Uo(CollectionsKt.sorted(ftsTableInfo.columns)) + "\n            |   options = {" + TableInfoKt.Uo(CollectionsKt.sorted(ftsTableInfo.options)) + "\n            |}\n        ", null, 1, null);
    }
}
