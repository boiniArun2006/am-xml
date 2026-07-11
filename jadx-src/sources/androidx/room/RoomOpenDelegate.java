package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/room/RoomOpenDelegate;", "Landroidx/room/RoomOpenDelegateMarker;", "", NodeModuleProcess.PROPERTY_VERSION, "", "identityHash", "legacyIdentityHash", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "Landroidx/sqlite/SQLiteConnection;", "connection", "", "J2", "(Landroidx/sqlite/SQLiteConnection;)V", "xMQ", "Landroidx/room/RoomOpenDelegate$ValidationResult;", "mUb", "(Landroidx/sqlite/SQLiteConnection;)Landroidx/room/RoomOpenDelegate$ValidationResult;", "KN", "Uo", c.f62177j, "rl", "I", "O", "()I", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "nr", "ValidationResult", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
public abstract class RoomOpenDelegate implements RoomOpenDelegateMarker {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String identityHash;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String legacyIdentityHash;

    public abstract void J2(SQLiteConnection connection);

    public abstract void KN(SQLiteConnection connection);

    public abstract void Uo(SQLiteConnection connection);

    public abstract ValidationResult mUb(SQLiteConnection connection);

    public abstract void n(SQLiteConnection connection);

    public abstract void rl(SQLiteConnection connection);

    public abstract void xMQ(SQLiteConnection connection);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/RoomOpenDelegate$ValidationResult;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", c.f62177j, "Z", "rl", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @RestrictTo
    public static final class ValidationResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public final boolean isValid;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        public final String expectedFoundMsg;

        public ValidationResult(boolean z2, String str) {
            this.isValid = z2;
            this.expectedFoundMsg = str;
        }
    }

    public RoomOpenDelegate(int i2, String identityHash, String legacyIdentityHash) {
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyIdentityHash, "legacyIdentityHash");
        this.version = i2;
        this.identityHash = identityHash;
        this.legacyIdentityHash = legacyIdentityHash;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final String getLegacyIdentityHash() {
        return this.legacyIdentityHash;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getIdentityHash() {
        return this.identityHash;
    }
}
