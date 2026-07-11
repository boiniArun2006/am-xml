package androidx.room.util;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/room/util/ForeignKeyWithSequence;", "", "", "id", "sequence", "", "from", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", InneractiveMediationNameConsts.OTHER, c.f62177j, "(Landroidx/room/util/ForeignKeyWithSequence;)I", "I", "t", "()I", "getSequence", "O", "Ljava/lang/String;", "rl", "()Ljava/lang/String;", "J2", "nr", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final String to;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final String from;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int sequence;

    public ForeignKeyWithSequence(int i2, int i3, String from, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.id = i2;
        this.sequence = i3;
        this.from = from;
        this.to = to;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(ForeignKeyWithSequence other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i2 = this.id - other.id;
        return i2 == 0 ? this.sequence - other.sequence : i2;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getId() {
        return this.id;
    }
}
