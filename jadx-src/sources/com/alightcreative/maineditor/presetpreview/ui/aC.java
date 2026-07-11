package com.alightcreative.maineditor.presetpreview.ui;

import a.C1498j;
import e.C1960j;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class aC {

    public static final class j extends aC {
        private final List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final C1960j f46717O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f46718n;
        private final C1498j nr;
        private final C1960j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f46719t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f46718n, jVar.f46718n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f46719t, jVar.f46719t) && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f46717O, jVar.f46717O) && Intrinsics.areEqual(this.J2, jVar.J2);
        }

        public int hashCode() {
            int iHashCode = this.f46718n.hashCode() * 31;
            C1960j c1960j = this.rl;
            int iHashCode2 = (((((iHashCode + (c1960j == null ? 0 : c1960j.hashCode())) * 31) + this.f46719t.hashCode()) * 31) + this.nr.hashCode()) * 31;
            C1960j c1960j2 = this.f46717O;
            int iHashCode3 = (iHashCode2 + (c1960j2 == null ? 0 : c1960j2.hashCode())) * 31;
            List list = this.J2;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Content(presetsData=" + this.f46718n + ", appliedPreset=" + this.rl + ", selectedPresets=" + this.f46719t + ", previewTimelineRowState=" + this.nr + ", isRenamingPreset=" + this.f46717O + ", isDeletingPresets=" + this.J2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List presetsData, C1960j c1960j, List selectedPresets, C1498j previewTimelineRowState, C1960j c1960j2, List list) {
            super(null);
            Intrinsics.checkNotNullParameter(presetsData, "presetsData");
            Intrinsics.checkNotNullParameter(selectedPresets, "selectedPresets");
            Intrinsics.checkNotNullParameter(previewTimelineRowState, "previewTimelineRowState");
            this.f46718n = presetsData;
            this.rl = c1960j;
            this.f46719t = selectedPresets;
            this.nr = previewTimelineRowState;
            this.f46717O = c1960j2;
            this.J2 = list;
        }

        public final C1960j J2() {
            return this.f46717O;
        }

        public final List O() {
            return this.J2;
        }

        public final C1960j n() {
            return this.rl;
        }

        public final List nr() {
            return this.f46719t;
        }

        public final List rl() {
            return this.f46718n;
        }

        public final C1498j t() {
            return this.nr;
        }
    }

    public /* synthetic */ aC(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private aC() {
    }
}
