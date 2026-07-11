package qwH;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qwH.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C2343c extends co4.C {
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f72570O;
    public static final j Uo = new j(null);
    private static final List KN = CollectionsKt.listOf((Object[]) new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final List xMQ = CollectionsKt.listOf((Object[]) new Integer[]{2, 1, 0, 2, 1, 0, 2, 1, 0});

    /* JADX INFO: renamed from: qwH.c$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public /* synthetic */ C2343c(int i2, int i3, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (i5 & 4) != 0 ? KN : list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2343c)) {
            return false;
        }
        C2343c c2343c = (C2343c) obj;
        return this.f72570O == c2343c.f72570O && this.J2 == c2343c.J2;
    }

    public int hashCode() {
        return (this.f72570O * 31) + this.J2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2343c(int i2, int i3, List zerosToAdd) {
        super(M.f72527n.n(), i2, i3, zerosToAdd);
        Intrinsics.checkNotNullParameter(zerosToAdd, "zerosToAdd");
        this.f72570O = i2;
        this.J2 = i3;
    }
}
