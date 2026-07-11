package androidx.room.util;

import android.database.CursorWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/room/util/CursorUtil$wrapMappedColumns$2", "Landroid/database/CursorWrapper;", "", "columnName", "", "getColumnIndex", "(Ljava/lang/String;)I", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCursorUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.android.kt\nandroidx/room/util/CursorUtil$wrapMappedColumns$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,177:1\n13467#2,3:178\n*S KotlinDebug\n*F\n+ 1 CursorUtil.android.kt\nandroidx/room/util/CursorUtil$wrapMappedColumns$2\n*L\n168#1:178,3\n*E\n"})
public final class CursorUtil$wrapMappedColumns$2 extends CursorWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ String[] f41778n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ int[] f41779t;

    @Override // android.database.CursorWrapper, android.database.Cursor
    public int getColumnIndex(String columnName) {
        Intrinsics.checkNotNullParameter(columnName, "columnName");
        String[] strArr = this.f41778n;
        int[] iArr = this.f41779t;
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i5 = i3 + 1;
            if (StringsKt.equals(strArr[i2], columnName, true)) {
                return iArr[i3];
            }
            i2++;
            i3 = i5;
        }
        return super.getColumnIndex(columnName);
    }
}
