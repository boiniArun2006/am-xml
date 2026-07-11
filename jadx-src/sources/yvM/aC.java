package yvM;

import a.C1498j;
import e.C1960j;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class aC {
    private final List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final C1960j f76195O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f76196n;
    private final C1498j nr;
    private final C1960j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f76197t;

    public aC(List presetsData, C1960j c1960j, List selectedPresets, C1498j previewTimelineRowState, C1960j c1960j2, List list) {
        Intrinsics.checkNotNullParameter(presetsData, "presetsData");
        Intrinsics.checkNotNullParameter(selectedPresets, "selectedPresets");
        Intrinsics.checkNotNullParameter(previewTimelineRowState, "previewTimelineRowState");
        this.f76196n = presetsData;
        this.rl = c1960j;
        this.f76197t = selectedPresets;
        this.nr = previewTimelineRowState;
        this.f76195O = c1960j2;
        this.J2 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aC)) {
            return false;
        }
        aC aCVar = (aC) obj;
        return Intrinsics.areEqual(this.f76196n, aCVar.f76196n) && Intrinsics.areEqual(this.rl, aCVar.rl) && Intrinsics.areEqual(this.f76197t, aCVar.f76197t) && Intrinsics.areEqual(this.nr, aCVar.nr) && Intrinsics.areEqual(this.f76195O, aCVar.f76195O) && Intrinsics.areEqual(this.J2, aCVar.J2);
    }

    public static /* synthetic */ aC rl(aC aCVar, List list, C1960j c1960j, List list2, C1498j c1498j, C1960j c1960j2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aCVar.f76196n;
        }
        if ((i2 & 2) != 0) {
            c1960j = aCVar.rl;
        }
        if ((i2 & 4) != 0) {
            list2 = aCVar.f76197t;
        }
        if ((i2 & 8) != 0) {
            c1498j = aCVar.nr;
        }
        if ((i2 & 16) != 0) {
            c1960j2 = aCVar.f76195O;
        }
        if ((i2 & 32) != 0) {
            list3 = aCVar.J2;
        }
        C1960j c1960j3 = c1960j2;
        List list4 = list3;
        return aCVar.n(list, c1960j, list2, c1498j, c1960j3, list4);
    }

    public final List J2() {
        return this.f76197t;
    }

    public final C1960j KN() {
        return this.f76195O;
    }

    public final C1498j O() {
        return this.nr;
    }

    public final List Uo() {
        return this.J2;
    }

    public int hashCode() {
        int iHashCode = this.f76196n.hashCode() * 31;
        C1960j c1960j = this.rl;
        int iHashCode2 = (((((iHashCode + (c1960j == null ? 0 : c1960j.hashCode())) * 31) + this.f76197t.hashCode()) * 31) + this.nr.hashCode()) * 31;
        C1960j c1960j2 = this.f76195O;
        int iHashCode3 = (iHashCode2 + (c1960j2 == null ? 0 : c1960j2.hashCode())) * 31;
        List list = this.J2;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final aC n(List presetsData, C1960j c1960j, List selectedPresets, C1498j previewTimelineRowState, C1960j c1960j2, List list) {
        Intrinsics.checkNotNullParameter(presetsData, "presetsData");
        Intrinsics.checkNotNullParameter(selectedPresets, "selectedPresets");
        Intrinsics.checkNotNullParameter(previewTimelineRowState, "previewTimelineRowState");
        return new aC(presetsData, c1960j, selectedPresets, previewTimelineRowState, c1960j2, list);
    }

    public final List nr() {
        return this.f76196n;
    }

    public final C1960j t() {
        return this.rl;
    }

    public String toString() {
        return "PresetPreviewViewModelState(presetsData=" + this.f76196n + ", appliedPreset=" + this.rl + ", selectedPresets=" + this.f76197t + ", previewTimelineRowState=" + this.nr + ", isRenamingPreset=" + this.f76195O + ", isDeletingPresets=" + this.J2 + ")";
    }

    public /* synthetic */ aC(List list, C1960j c1960j, List list2, C1498j c1498j, C1960j c1960j2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : c1960j, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list2, c1498j, (i2 & 16) != 0 ? null : c1960j2, (i2 & 32) != 0 ? null : list3);
    }
}
