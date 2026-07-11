package com.alightcreative.maineditor.presetpreview.ui;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre {

    public static final class I28 extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f46711n = new I28();

        private I28() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof I28);
        }

        public int hashCode() {
            return -1970447008;
        }

        public String toString() {
            return "OpenBottomSheet";
        }
    }

    public static final class Ml extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f46712n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ml) && Intrinsics.areEqual(this.f46712n, ((Ml) obj).f46712n);
        }

        public int hashCode() {
            return this.f46712n.hashCode();
        }

        public String toString() {
            return "Import(linkUri=" + this.f46712n + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Uri linkUri) {
            super(null);
            Intrinsics.checkNotNullParameter(linkUri, "linkUri");
            this.f46712n = linkUri;
        }

        public final Uri n() {
            return this.f46712n;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.maineditor.presetpreview.ui.Wre$Wre, reason: collision with other inner class name */
    public static final class C0666Wre extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0666Wre f46713n = new C0666Wre();

        private C0666Wre() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0666Wre);
        }

        public int hashCode() {
            return -1466273747;
        }

        public String toString() {
            return "PresetImported";
        }
    }

    public static final class j extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f46714n = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 2359174;
        }

        public String toString() {
            return "CloseBottomSheet";
        }
    }

    public static final class n extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f46715n;
        private final boolean rl;

        public /* synthetic */ n(String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? false : z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f46715n, nVar.f46715n) && this.rl == nVar.rl;
        }

        public int hashCode() {
            String str = this.f46715n;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.rl);
        }

        public String toString() {
            return "ClosePreview(selectedPresetId=" + this.f46715n + ", showDeleteToast=" + this.rl + ")";
        }

        public n(String str, boolean z2) {
            super(null);
            this.f46715n = str;
            this.rl = z2;
        }

        public final String n() {
            return this.f46715n;
        }

        public final boolean rl() {
            return this.rl;
        }
    }

    public static final class w6 extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f46716n;
        private final List rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f46716n, w6Var.f46716n) && Intrinsics.areEqual(this.rl, w6Var.rl);
        }

        public int hashCode() {
            return (this.f46716n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "ExportPresets(selectedPresets=" + this.f46716n + ", exportSnapshots=" + this.rl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(List selectedPresets, List exportSnapshots) {
            super(null);
            Intrinsics.checkNotNullParameter(selectedPresets, "selectedPresets");
            Intrinsics.checkNotNullParameter(exportSnapshots, "exportSnapshots");
            this.f46716n = selectedPresets;
            this.rl = exportSnapshots;
        }

        public final List n() {
            return this.rl;
        }

        public final List rl() {
            return this.f46716n;
        }
    }

    public /* synthetic */ Wre(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Wre() {
    }
}
