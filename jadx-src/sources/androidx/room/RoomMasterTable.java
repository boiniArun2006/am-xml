package androidx.room;

import androidx.annotation.RestrictTo;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/room/RoomMasterTable;", "", "<init>", "()V", "", "hash", c.f62177j, "(Ljava/lang/String;)Ljava/lang/String;", "room-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
public final class RoomMasterTable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final RoomMasterTable f41417n = new RoomMasterTable();

    public static final String n(String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }

    private RoomMasterTable() {
    }
}
