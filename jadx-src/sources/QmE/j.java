package QmE;

import android.os.Bundle;
import cg.o;
import com.alightcreative.app.motion.scene.SceneType;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import f.EnumC1982eO;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface j {

    public static final class AZy implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8373n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AZy)) {
                return false;
            }
            AZy aZy = (AZy) obj;
            return Intrinsics.areEqual(this.f8373n, aZy.f8373n) && Intrinsics.areEqual(this.rl, aZy.rl);
        }

        public AZy(String productId, String str) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f8373n = productId;
            this.rl = str;
        }

        public int hashCode() {
            int iHashCode = this.f8373n.hashCode() * 31;
            String str = this.rl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String n() {
            return this.rl;
        }

        public final String rl() {
            return this.f8373n;
        }

        public String toString() {
            return "MonetizationPurchasePending(productId=" + this.f8373n + ", hook=" + this.rl + ")";
        }
    }

    public static final class B implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final B f8374n = new B();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof B);
        }

        public String toString() {
            return "HelpCenterButtonTapped";
        }

        private B() {
        }

        public int hashCode() {
            return -1278024588;
        }
    }

    public static final class Buf implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8375n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Buf)) {
                return false;
            }
            Buf buf = (Buf) obj;
            return Intrinsics.areEqual(this.f8375n, buf.f8375n) && Intrinsics.areEqual(this.rl, buf.rl);
        }

        public Buf(String projectPackageId, String str) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            this.f8375n = projectPackageId;
            this.rl = str;
        }

        public int hashCode() {
            int iHashCode = this.f8375n.hashCode() * 31;
            String str = this.rl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ProjectPackageImportPopupShown(projectPackageId=" + this.f8375n + ", premadeContentItemId=" + this.rl + ")";
        }
    }

    public static final class C implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8376n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C) && Intrinsics.areEqual(this.f8376n, ((C) obj).f8376n);
        }

        public int hashCode() {
            String str = this.f8376n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "BorderAndShadowButtonTapped(projectId=" + this.f8376n + ")";
        }

        public C(String str) {
            this.f8376n = str;
        }
    }

    public static final class CM implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.aC f8377n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CM) && this.f8377n == ((CM) obj).f8377n;
        }

        public CM(rWZ.aC joinRankingSource) {
            Intrinsics.checkNotNullParameter(joinRankingSource, "joinRankingSource");
            this.f8377n = joinRankingSource;
        }

        public int hashCode() {
            return this.f8377n.hashCode();
        }

        public String toString() {
            return "JoinRankingButtonTapped(joinRankingSource=" + this.f8377n + ")";
        }
    }

    public static final class CN3 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8378n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CN3) && Intrinsics.areEqual(this.f8378n, ((CN3) obj).f8378n);
        }

        public CN3(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8378n = projectId;
        }

        public int hashCode() {
            return this.f8378n.hashCode();
        }

        public String toString() {
            return "AddLayerMenuTemplateTabOpened(projectId=" + this.f8378n + ")";
        }
    }

    public static final class Ch implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8379n;
        private final xr.j nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SceneType f8380t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ch)) {
                return false;
            }
            Ch ch = (Ch) obj;
            return Intrinsics.areEqual(this.f8379n, ch.f8379n) && Intrinsics.areEqual(this.rl, ch.rl) && this.f8380t == ch.f8380t && Intrinsics.areEqual(this.nr, ch.nr);
        }

        public Ch(String projectPackageId, String projectId, SceneType projectType, xr.j templateEditorTriggerPoint) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectType, "projectType");
            Intrinsics.checkNotNullParameter(templateEditorTriggerPoint, "templateEditorTriggerPoint");
            this.f8379n = projectPackageId;
            this.rl = projectId;
            this.f8380t = projectType;
            this.nr = templateEditorTriggerPoint;
        }

        public int hashCode() {
            return (((((this.f8379n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8380t.hashCode()) * 31) + this.nr.hashCode();
        }

        public String toString() {
            return "TemplateImportClipSelectionEditorClosed(projectPackageId=" + this.f8379n + ", projectId=" + this.rl + ", projectType=" + this.f8380t + ", templateEditorTriggerPoint=" + this.nr + ")";
        }
    }

    public static final class D implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final EnumC1982eO f8381n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof D) && this.f8381n == ((D) obj).f8381n;
        }

        public int hashCode() {
            EnumC1982eO enumC1982eO = this.f8381n;
            if (enumC1982eO == null) {
                return 0;
            }
            return enumC1982eO.hashCode();
        }

        public final EnumC1982eO n() {
            return this.f8381n;
        }

        public String toString() {
            return "PaywallAlertDismissed(paywallType=" + this.f8381n + ")";
        }

        public D(EnumC1982eO enumC1982eO) {
            this.f8381n = enumC1982eO;
        }
    }

    public static final class DAz implements j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final long f8382O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final cg.o f8383n;
        private final long nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f8384t;

        public DAz(cg.o reward, String email, String str, long j2, long j3) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            Intrinsics.checkNotNullParameter(email, "email");
            this.f8383n = reward;
            this.rl = email;
            this.f8384t = str;
            this.nr = j2;
            this.f8382O = j3;
        }
    }

    public static final class DC implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8385n;
        private final rWZ.C rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f8386t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DC)) {
                return false;
            }
            DC dc = (DC) obj;
            return Intrinsics.areEqual(this.f8385n, dc.f8385n) && this.rl == dc.rl && Intrinsics.areEqual(this.f8386t, dc.f8386t);
        }

        public DC(String str, rWZ.C c2, String curveType) {
            Intrinsics.checkNotNullParameter(curveType, "curveType");
            this.f8385n = str;
            this.rl = c2;
            this.f8386t = curveType;
        }

        public int hashCode() {
            String str = this.f8385n;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            rWZ.C c2 = this.rl;
            return ((iHashCode + (c2 != null ? c2.hashCode() : 0)) * 31) + this.f8386t.hashCode();
        }

        public String toString() {
            return "KeyframeCurveEdited(projectId=" + this.f8385n + ", layerType=" + this.rl + ", curveType=" + this.f8386t + ")";
        }
    }

    public static final class DT implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8387n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DT) && Intrinsics.areEqual(this.f8387n, ((DT) obj).f8387n);
        }

        public DT(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8387n = projectId;
        }

        public int hashCode() {
            return this.f8387n.hashCode();
        }

        public String toString() {
            return "PlusAddEffectButtonTapped(projectId=" + this.f8387n + ")";
        }
    }

    public static final class Dsr implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8388n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dsr)) {
                return false;
            }
            Dsr dsr = (Dsr) obj;
            return Intrinsics.areEqual(this.f8388n, dsr.f8388n) && Intrinsics.areEqual(this.rl, dsr.rl);
        }

        public Dsr(String link, String str) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.f8388n = link;
            this.rl = str;
        }

        public int hashCode() {
            int iHashCode = this.f8388n.hashCode() * 31;
            String str = this.rl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AppOpenedFromLink(link=" + this.f8388n + ", source=" + this.rl + ")";
        }
    }

    /* JADX INFO: renamed from: QmE.j$Dt, reason: case insensitive filesystem */
    public static final class C1435Dt implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8389n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1435Dt) && Intrinsics.areEqual(this.f8389n, ((C1435Dt) obj).f8389n);
        }

        public C1435Dt(String projectPackageId) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            this.f8389n = projectPackageId;
        }

        public int hashCode() {
            return this.f8389n.hashCode();
        }

        public String toString() {
            return "ProjectPackageImportPopupDismissed(projectPackageId=" + this.f8389n + ")";
        }
    }

    public static final class Ew implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ew f8390n = new Ew();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ew);
        }

        public String toString() {
            return "CreatorProgramJoined";
        }

        private Ew() {
        }

        public int hashCode() {
            return -1223744479;
        }
    }

    public static final class FKk implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.n f8391n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FKk) && Intrinsics.areEqual(this.f8391n, ((FKk) obj).f8391n);
        }

        public FKk(rWZ.n exportSnapshot) {
            Intrinsics.checkNotNullParameter(exportSnapshot, "exportSnapshot");
            this.f8391n = exportSnapshot;
        }

        public int hashCode() {
            return this.f8391n.hashCode();
        }

        public final rWZ.n n() {
            return this.f8391n;
        }

        public String toString() {
            return "ExportShared(exportSnapshot=" + this.f8391n + ")";
        }
    }

    public static final class FP implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final FP f8392n = new FP();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FP);
        }

        public String toString() {
            return "RankingOptOutCompleted";
        }

        private FP() {
        }

        public int hashCode() {
            return -109677606;
        }
    }

    public static final class FPL implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8393n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FPL) && Intrinsics.areEqual(this.f8393n, ((FPL) obj).f8393n);
        }

        public FPL(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8393n = projectId;
        }

        public int hashCode() {
            return this.f8393n.hashCode();
        }

        public String toString() {
            return "MediaTabTapped(projectId=" + this.f8393n + ")";
        }
    }

    public static final class Fl implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8394n;
        private final String rl;

        public Fl(String str, String str2) {
            this.f8394n = str;
            this.rl = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fl)) {
                return false;
            }
            Fl fl = (Fl) obj;
            return Intrinsics.areEqual(this.f8394n, fl.f8394n) && Intrinsics.areEqual(this.rl, fl.rl);
        }

        public int hashCode() {
            String str = this.f8394n;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.rl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ExportSharedExternalApp(packageName=" + this.f8394n + ", error=" + this.rl + ")";
        }

        public /* synthetic */ Fl(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : str2);
        }
    }

    public static final class Fo implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8395n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fo) && Intrinsics.areEqual(this.f8395n, ((Fo) obj).f8395n);
        }

        public Fo(String hook) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            this.f8395n = hook;
        }

        public int hashCode() {
            return this.f8395n.hashCode();
        }

        public String toString() {
            return "SurveyShown(hook=" + this.f8395n + ")";
        }
    }

    public static final class H implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8396n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof H) && Intrinsics.areEqual(this.f8396n, ((H) obj).f8396n);
        }

        public H(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8396n = projectId;
        }

        public int hashCode() {
            return this.f8396n.hashCode();
        }

        public String toString() {
            return "RedoButtonTapped(projectId=" + this.f8396n + ")";
        }
    }

    public static final class H9 implements j {
        private final xr.j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f8397O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8398n;
        private final int nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SceneType f8399t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof H9)) {
                return false;
            }
            H9 h9 = (H9) obj;
            return Intrinsics.areEqual(this.f8398n, h9.f8398n) && Intrinsics.areEqual(this.rl, h9.rl) && this.f8399t == h9.f8399t && this.nr == h9.nr && this.f8397O == h9.f8397O && Intrinsics.areEqual(this.J2, h9.J2);
        }

        public H9(String projectPackageId, String projectId, SceneType projectType, int i2, int i3, xr.j templateEditorTriggerPoint) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectType, "projectType");
            Intrinsics.checkNotNullParameter(templateEditorTriggerPoint, "templateEditorTriggerPoint");
            this.f8398n = projectPackageId;
            this.rl = projectId;
            this.f8399t = projectType;
            this.nr = i2;
            this.f8397O = i3;
            this.J2 = templateEditorTriggerPoint;
        }

        public int hashCode() {
            return (((((((((this.f8398n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8399t.hashCode()) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f8397O)) * 31) + this.J2.hashCode();
        }

        public String toString() {
            return "TemplateImportTimelineAccessed(projectPackageId=" + this.f8398n + ", projectId=" + this.rl + ", projectType=" + this.f8399t + ", originalMediaCount=" + this.nr + ", replacedMediaCount=" + this.f8397O + ", templateEditorTriggerPoint=" + this.J2 + ")";
        }
    }

    public static final class HcS implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final HcS f8400n = new HcS();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof HcS);
        }

        public String toString() {
            return "OnboardingCompleted";
        }

        private HcS() {
        }

        public int hashCode() {
            return -1029545872;
        }
    }

    public static final class I implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I f8401n = new I();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof I);
        }

        public String toString() {
            return "SignOutCompleted";
        }

        private I() {
        }

        public int hashCode() {
            return 527149818;
        }
    }

    public static final class I7 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I7 f8403n = new I7();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof I7);
        }

        public String toString() {
            return "RankingEditProfileCompleted";
        }

        private I7() {
        }

        public int hashCode() {
            return -1035971550;
        }
    }

    public static final class IE implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8404n;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final EnumC1982eO f8405t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IE)) {
                return false;
            }
            IE ie = (IE) obj;
            return Intrinsics.areEqual(this.f8404n, ie.f8404n) && Intrinsics.areEqual(this.rl, ie.rl) && this.f8405t == ie.f8405t;
        }

        public IE(String str, List availableProducts, EnumC1982eO enumC1982eO) {
            Intrinsics.checkNotNullParameter(availableProducts, "availableProducts");
            this.f8404n = str;
            this.rl = availableProducts;
            this.f8405t = enumC1982eO;
        }

        public int hashCode() {
            String str = this.f8404n;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode()) * 31;
            EnumC1982eO enumC1982eO = this.f8405t;
            return iHashCode + (enumC1982eO != null ? enumC1982eO.hashCode() : 0);
        }

        public final List n() {
            return this.rl;
        }

        public final String rl() {
            return this.f8404n;
        }

        public final EnumC1982eO t() {
            return this.f8405t;
        }

        public String toString() {
            return "PaywallShown(hook=" + this.f8404n + ", availableProducts=" + this.rl + ", paywallType=" + this.f8405t + ")";
        }
    }

    public static final class IG implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final IG f8406n = new IG();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof IG);
        }

        public String toString() {
            return "MdtContentLibraryTemplateTabEntryPointTapped";
        }

        private IG() {
        }

        public int hashCode() {
            return 757914790;
        }
    }

    public static final class Il5 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Il5 f8407n = new Il5();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Il5);
        }

        public String toString() {
            return "SettingsButtonTapped";
        }

        private Il5() {
        }

        public int hashCode() {
            return -1396346335;
        }
    }

    public static final class Iuj implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8408n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Iuj) && Intrinsics.areEqual(this.f8408n, ((Iuj) obj).f8408n);
        }

        public Iuj(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.f8408n = link;
        }

        public int hashCode() {
            return this.f8408n.hashCode();
        }

        public String toString() {
            return "TutorialsYoutubePostOpened(link=" + this.f8408n + ")";
        }
    }

    public static final class J implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8409n;
        private final Exception rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof J)) {
                return false;
            }
            J j2 = (J) obj;
            return Intrinsics.areEqual(this.f8409n, j2.f8409n) && Intrinsics.areEqual(this.rl, j2.rl);
        }

        public int hashCode() {
            String str = this.f8409n;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Exception exc = this.rl;
            return iHashCode + (exc != null ? exc.hashCode() : 0);
        }

        public final Exception n() {
            return this.rl;
        }

        public final String rl() {
            return this.f8409n;
        }

        public String toString() {
            return "SignInFailed(provider=" + this.f8409n + ", exception=" + this.rl + ")";
        }

        public J(String str, Exception exc) {
            this.f8409n = str;
            this.rl = exc;
        }
    }

    public static final class J2L implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final J2L f8410n = new J2L();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof J2L);
        }

        public String toString() {
            return "UnlinkAuthProviderCompleted";
        }

        private J2L() {
        }

        public int hashCode() {
            return -1031993281;
        }
    }

    public static final class Ji implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ji f8411n = new Ji();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ji);
        }

        public String toString() {
            return "SignInCanceled";
        }

        private Ji() {
        }

        public int hashCode() {
            return -907517829;
        }
    }

    public static final class Jr implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Jr f8412n = new Jr();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Jr);
        }

        public String toString() {
            return "UserGuideButtonTapped";
        }

        private Jr() {
        }

        public int hashCode() {
            return 1140611823;
        }
    }

    public static final class K implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8413n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof K) && Intrinsics.areEqual(this.f8413n, ((K) obj).f8413n);
        }

        public int hashCode() {
            String str = this.f8413n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EditTextButtonTapped(projectId=" + this.f8413n + ")";
        }

        public K(String str) {
            this.f8413n = str;
        }
    }

    public static final class KH implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8414n;
        private final int nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f8415t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KH)) {
                return false;
            }
            KH kh = (KH) obj;
            return Intrinsics.areEqual(this.f8414n, kh.f8414n) && this.rl == kh.rl && this.f8415t == kh.f8415t && this.nr == kh.nr;
        }

        public KH(String projectId, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8414n = projectId;
            this.rl = i2;
            this.f8415t = i3;
            this.nr = i5;
        }

        public int hashCode() {
            return (((((this.f8414n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f8415t)) * 31) + Integer.hashCode(this.nr);
        }

        public String toString() {
            return "ElementCreated(projectId=" + this.f8414n + ", projectWidth=" + this.rl + ", projectHeight=" + this.f8415t + ", frameRate=" + this.nr + ")";
        }
    }

    public static final class Kk1 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8416n;
        private final String rl;

        public Kk1(String str, String str2) {
            this.f8416n = str;
            this.rl = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Kk1)) {
                return false;
            }
            Kk1 kk1 = (Kk1) obj;
            return Intrinsics.areEqual(this.f8416n, kk1.f8416n) && Intrinsics.areEqual(this.rl, kk1.rl);
        }

        public int hashCode() {
            String str = this.f8416n;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.rl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ProjectPackageSharedExternalApp(packageName=" + this.f8416n + ", error=" + this.rl + ")";
        }

        public /* synthetic */ Kk1(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : str2);
        }
    }

    public static final class L0y implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final L0y f8417n = new L0y();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof L0y);
        }

        public String toString() {
            return "ImportXmlTapped";
        }

        private L0y() {
        }

        public int hashCode() {
            return -113344162;
        }
    }

    public static final class LEl implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8418n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LEl) && Intrinsics.areEqual(this.f8418n, ((LEl) obj).f8418n);
        }

        public int hashCode() {
            String str = this.f8418n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsRepeatButtonTapped(projectId=" + this.f8418n + ")";
        }

        public LEl(String str) {
            this.f8418n = str;
        }
    }

    public static final class Lc implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.n f8419n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Lc) && Intrinsics.areEqual(this.f8419n, ((Lc) obj).f8419n);
        }

        public Lc(rWZ.n exportSnapshot) {
            Intrinsics.checkNotNullParameter(exportSnapshot, "exportSnapshot");
            this.f8419n = exportSnapshot;
        }

        public int hashCode() {
            return this.f8419n.hashCode();
        }

        public String toString() {
            return "ProjectPackageShared(exportSnapshot=" + this.f8419n + ")";
        }
    }

    public static final class Ln implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8420n;
        private final String rl;

        public Ln(String hook, String link) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            Intrinsics.checkNotNullParameter(link, "link");
            this.f8420n = hook;
            this.rl = link;
        }

        public final String n() {
            return this.f8420n;
        }

        public final String rl() {
            return this.rl;
        }
    }

    public static final class Lu implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8421n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Lu) && Intrinsics.areEqual(this.f8421n, ((Lu) obj).f8421n);
        }

        public int hashCode() {
            String str = this.f8421n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EditPointsButtonTapped(projectId=" + this.f8421n + ")";
        }

        public Lu(String str) {
            this.f8421n = str;
        }
    }

    public static final class M implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8422n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof M) && Intrinsics.areEqual(this.f8422n, ((M) obj).f8422n);
        }

        public M(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8422n = projectId;
        }

        public int hashCode() {
            return this.f8422n.hashCode();
        }

        public String toString() {
            return "DuplicateLayerTapped(projectId=" + this.f8422n + ")";
        }
    }

    public static final class M5 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.n f8423n;
        private final boolean rl;

        public M5(rWZ.n exportSnapshot, boolean z2) {
            Intrinsics.checkNotNullParameter(exportSnapshot, "exportSnapshot");
            this.f8423n = exportSnapshot;
            this.rl = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof M5)) {
                return false;
            }
            M5 m5 = (M5) obj;
            return Intrinsics.areEqual(this.f8423n, m5.f8423n) && this.rl == m5.rl;
        }

        public int hashCode() {
            return (this.f8423n.hashCode() * 31) + Boolean.hashCode(this.rl);
        }

        public final rWZ.n n() {
            return this.f8423n;
        }

        public final boolean rl() {
            return this.rl;
        }

        public String toString() {
            return "ExportFlowCompleted(exportSnapshot=" + this.f8423n + ", qrCodeGenerationError=" + this.rl + ")";
        }

        public /* synthetic */ M5(rWZ.n nVar, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(nVar, (i2 & 2) != 0 ? false : z2);
        }
    }

    public static final class MKd implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8424n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MKd) && Intrinsics.areEqual(this.f8424n, ((MKd) obj).f8424n);
        }

        public MKd(String projectPackageId) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            this.f8424n = projectPackageId;
        }

        public int hashCode() {
            return this.f8424n.hashCode();
        }

        public String toString() {
            return "ProjectPackageImportStarted(projectPackageId=" + this.f8424n + ")";
        }
    }

    public static final class Md implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8425n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Md)) {
                return false;
            }
            Md md = (Md) obj;
            return Intrinsics.areEqual(this.f8425n, md.f8425n) && Intrinsics.areEqual(this.rl, md.rl);
        }

        public Md(String str, String effectName) {
            Intrinsics.checkNotNullParameter(effectName, "effectName");
            this.f8425n = str;
            this.rl = effectName;
        }

        public int hashCode() {
            String str = this.f8425n;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "EffectGuideButtonTapped(projectId=" + this.f8425n + ", effectName=" + this.rl + ")";
        }
    }

    public static final class Mf implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8426n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Mf) && Intrinsics.areEqual(this.f8426n, ((Mf) obj).f8426n);
        }

        public Mf(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8426n = projectId;
        }

        public int hashCode() {
            return this.f8426n.hashCode();
        }

        public String toString() {
            return "ElementOpened(projectId=" + this.f8426n + ")";
        }
    }

    public static final class Mje implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8427n;
        private final rWZ.C rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mje)) {
                return false;
            }
            Mje mje = (Mje) obj;
            return Intrinsics.areEqual(this.f8427n, mje.f8427n) && this.rl == mje.rl;
        }

        public Mje(String str, rWZ.C layerType) {
            Intrinsics.checkNotNullParameter(layerType, "layerType");
            this.f8427n = str;
            this.rl = layerType;
        }

        public int hashCode() {
            String str = this.f8427n;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "SpeedKeyframeAdded(projectId=" + this.f8427n + ", layerType=" + this.rl + ")";
        }
    }

    public static final class Ml implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f8428n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return this.f8428n == ml.f8428n && Intrinsics.areEqual(this.rl, ml.rl);
        }

        public Ml(int i2, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f8428n = i2;
            this.rl = message;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f8428n) * 31) + this.rl.hashCode();
        }

        public final int n() {
            return this.f8428n;
        }

        public final String rl() {
            return this.rl;
        }

        public String toString() {
            return "AdMobCMPConsentFailed(errorCode=" + this.f8428n + ", message=" + this.rl + ")";
        }
    }

    public static final class Mo implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Mo f8429n = new Mo();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Mo);
        }

        public String toString() {
            return "NextStepsButtonTapped";
        }

        private Mo() {
        }

        public int hashCode() {
            return 776183922;
        }
    }

    public static final class N implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8430n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof N) && Intrinsics.areEqual(this.f8430n, ((N) obj).f8430n);
        }

        public N(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8430n = projectId;
        }

        public int hashCode() {
            return this.f8430n.hashCode();
        }

        public String toString() {
            return "MdtContentLibraryMainEditorPresetEntryPointTapped(projectId=" + this.f8430n + ")";
        }
    }

    public static final class O implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8431n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof O) && Intrinsics.areEqual(this.f8431n, ((O) obj).f8431n);
        }

        public int hashCode() {
            String str = this.f8431n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsProceduralButtonTapped(projectId=" + this.f8431n + ")";
        }

        public O(String str) {
            this.f8431n = str;
        }
    }

    public static final class OA implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final OA f8432n = new OA();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OA);
        }

        public String toString() {
            return "MyAccountButtonTapped";
        }

        private OA() {
        }

        public int hashCode() {
            return 1749485535;
        }
    }

    public static final class OB3 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final OB3 f8433n = new OB3();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OB3);
        }

        public String toString() {
            return "TapsOnOtherOptions";
        }

        private OB3() {
        }

        public int hashCode() {
            return 1403860029;
        }
    }

    public static final class OU implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8434n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OU) && Intrinsics.areEqual(this.f8434n, ((OU) obj).f8434n);
        }

        public int hashCode() {
            String str = this.f8434n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsOpacityVisibilityButtonTapped(projectId=" + this.f8434n + ")";
        }

        public OU(String str) {
            this.f8434n = str;
        }
    }

    public static final class Ogx implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8435n;
        private final rWZ.C rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f8436t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ogx)) {
                return false;
            }
            Ogx ogx = (Ogx) obj;
            return Intrinsics.areEqual(this.f8435n, ogx.f8435n) && this.rl == ogx.rl && Intrinsics.areEqual(this.f8436t, ogx.f8436t);
        }

        public Ogx(String str, rWZ.C layerType, String curveType) {
            Intrinsics.checkNotNullParameter(layerType, "layerType");
            Intrinsics.checkNotNullParameter(curveType, "curveType");
            this.f8435n = str;
            this.rl = layerType;
            this.f8436t = curveType;
        }

        public int hashCode() {
            String str = this.f8435n;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode()) * 31) + this.f8436t.hashCode();
        }

        public String toString() {
            return "KeyframeCurveAdded(projectId=" + this.f8435n + ", layerType=" + this.rl + ", curveType=" + this.f8436t + ")";
        }
    }

    public static final class P implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8437n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof P) && Intrinsics.areEqual(this.f8437n, ((P) obj).f8437n);
        }

        public int hashCode() {
            String str = this.f8437n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Effects3dButtonTapped(projectId=" + this.f8437n + ")";
        }

        public P(String str) {
            this.f8437n = str;
        }
    }

    public static final class Pl implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Pl f8438n = new Pl();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Pl);
        }

        public String toString() {
            return "CloudDownloadFlowStarted";
        }

        private Pl() {
        }

        public int hashCode() {
            return -1121158314;
        }
    }

    public static final class Pmq implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8439n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Pmq) && Intrinsics.areEqual(this.f8439n, ((Pmq) obj).f8439n);
        }

        public Pmq(String categoryId) {
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            this.f8439n = categoryId;
        }

        public int hashCode() {
            return this.f8439n.hashCode();
        }

        public String toString() {
            return "MdtContentLibraryCategoryItemTapped(categoryId=" + this.f8439n + ")";
        }
    }

    public static final class Pp implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8440n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Pp) && Intrinsics.areEqual(this.f8440n, ((Pp) obj).f8440n);
        }

        public Pp(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8440n = projectId;
        }

        public int hashCode() {
            return this.f8440n.hashCode();
        }

        public String toString() {
            return "MdtContentLibraryMainEditorEntryPointTapped(projectId=" + this.f8440n + ")";
        }
    }

    public static final class Q implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8441n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Q) && Intrinsics.areEqual(this.f8441n, ((Q) obj).f8441n);
        }

        public int hashCode() {
            String str = this.f8441n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ColorAndFillButtonTapped(projectId=" + this.f8441n + ")";
        }

        public Q(String str) {
            this.f8441n = str;
        }
    }

    public static final class QJ implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f8442n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QJ) && this.f8442n == ((QJ) obj).f8442n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f8442n);
        }

        public final boolean n() {
            return this.f8442n;
        }

        public String toString() {
            return "CloudUploadCompleted(isProjectOverridden=" + this.f8442n + ")";
        }

        public QJ(boolean z2) {
            this.f8442n = z2;
        }
    }

    public interface QUT extends j {
    }

    public static final class QaP implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.n f8443n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QaP) && Intrinsics.areEqual(this.f8443n, ((QaP) obj).f8443n);
        }

        public QaP(rWZ.n exportSnapshot) {
            Intrinsics.checkNotNullParameter(exportSnapshot, "exportSnapshot");
            this.f8443n = exportSnapshot;
        }

        public int hashCode() {
            return this.f8443n.hashCode();
        }

        public final rWZ.n n() {
            return this.f8443n;
        }

        public String toString() {
            return "ExportSaved(exportSnapshot=" + this.f8443n + ")";
        }
    }

    public static final class QhI implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FX.Ml f8444n;

        public QhI(FX.Ml socialMedia) {
            Intrinsics.checkNotNullParameter(socialMedia, "socialMedia");
            this.f8444n = socialMedia;
        }
    }

    public static final class Qik implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8445n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Qik) && Intrinsics.areEqual(this.f8445n, ((Qik) obj).f8445n);
        }

        public int hashCode() {
            String str = this.f8445n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "MoveAndTransformButtonTapped(projectId=" + this.f8445n + ")";
        }

        public Qik(String str) {
            this.f8445n = str;
        }
    }

    public static final class R6 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final R6 f8446n = new R6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof R6);
        }

        public String toString() {
            return "ExportUiCloseButtonTapped";
        }

        private R6() {
        }

        public int hashCode() {
            return -790193170;
        }
    }

    public static final class RGN implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8447n;
        private final List rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RGN)) {
                return false;
            }
            RGN rgn = (RGN) obj;
            return Intrinsics.areEqual(this.f8447n, rgn.f8447n) && Intrinsics.areEqual(this.rl, rgn.rl);
        }

        public RGN(String str, List layersType) {
            Intrinsics.checkNotNullParameter(layersType, "layersType");
            this.f8447n = str;
            this.rl = layersType;
        }

        public int hashCode() {
            String str = this.f8447n;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "GroupLayerButtonTapped(projectId=" + this.f8447n + ", layersType=" + this.rl + ")";
        }
    }

    public static final class RzR implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8448n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RzR) && Intrinsics.areEqual(this.f8448n, ((RzR) obj).f8448n);
        }

        public RzR(String exportPage) {
            Intrinsics.checkNotNullParameter(exportPage, "exportPage");
            this.f8448n = exportPage;
        }

        public int hashCode() {
            return this.f8448n.hashCode();
        }

        public final String n() {
            return this.f8448n;
        }

        public String toString() {
            return "ExportUiScrolled(exportPage=" + this.f8448n + ")";
        }
    }

    public static final class S implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final S f8449n = new S();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof S);
        }

        public String toString() {
            return "MonetizationSubscriptionStarted";
        }

        private S() {
        }

        public int hashCode() {
            return -1520835429;
        }
    }

    public static final class SPz implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final SPz f8450n = new SPz();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SPz);
        }

        public String toString() {
            return "Countdown24HrsPaywallMyAccountCtaTriggered";
        }

        private SPz() {
        }

        public int hashCode() {
            return 1828385516;
        }
    }

    public static final class Sis implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8451n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Sis) && Intrinsics.areEqual(this.f8451n, ((Sis) obj).f8451n);
        }

        public int hashCode() {
            String str = this.f8451n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsDrawingAndEdgeButtonTapped(projectId=" + this.f8451n + ")";
        }

        public Sis(String str) {
            this.f8451n = str;
        }
    }

    public static final class Su implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Su f8452n = new Su();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Su);
        }

        public String toString() {
            return "SignInStarted";
        }

        private Su() {
        }

        public int hashCode() {
            return -1506844577;
        }
    }

    public static final class Sw implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8453n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sw)) {
                return false;
            }
            Sw sw = (Sw) obj;
            return Intrinsics.areEqual(this.f8453n, sw.f8453n) && Intrinsics.areEqual(this.rl, sw.rl);
        }

        public Sw(String hook, String ctaId) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            Intrinsics.checkNotNullParameter(ctaId, "ctaId");
            this.f8453n = hook;
            this.rl = ctaId;
        }

        public int hashCode() {
            return (this.f8453n.hashCode() * 31) + this.rl.hashCode();
        }

        public final String n() {
            return this.rl;
        }

        public final String rl() {
            return this.f8453n;
        }

        public String toString() {
            return "PopupButtonTapped(hook=" + this.f8453n + ", ctaId=" + this.rl + ")";
        }
    }

    public static final class T implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8454n;
        private final rWZ.C rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof T)) {
                return false;
            }
            T t3 = (T) obj;
            return Intrinsics.areEqual(this.f8454n, t3.f8454n) && this.rl == t3.rl;
        }

        public T(String projectId, rWZ.C layerType) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(layerType, "layerType");
            this.f8454n = projectId;
            this.rl = layerType;
        }

        public int hashCode() {
            return (this.f8454n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "LayerAdded(projectId=" + this.f8454n + ", layerType=" + this.rl + ")";
        }
    }

    public static final class U implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8455n;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final EnumC1982eO f8456t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof U)) {
                return false;
            }
            U u2 = (U) obj;
            return Intrinsics.areEqual(this.f8455n, u2.f8455n) && Intrinsics.areEqual(this.rl, u2.rl) && this.f8456t == u2.f8456t;
        }

        public U(String str, List availableProducts, EnumC1982eO enumC1982eO) {
            Intrinsics.checkNotNullParameter(availableProducts, "availableProducts");
            this.f8455n = str;
            this.rl = availableProducts;
            this.f8456t = enumC1982eO;
        }

        public int hashCode() {
            String str = this.f8455n;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode()) * 31;
            EnumC1982eO enumC1982eO = this.f8456t;
            return iHashCode + (enumC1982eO != null ? enumC1982eO.hashCode() : 0);
        }

        public final List n() {
            return this.rl;
        }

        public final String rl() {
            return this.f8455n;
        }

        public final EnumC1982eO t() {
            return this.f8456t;
        }

        public String toString() {
            return "PaywallDismissedWithAd(hook=" + this.f8455n + ", availableProducts=" + this.rl + ", paywallType=" + this.f8456t + ")";
        }
    }

    public static final class U4 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8457n;
        private final rWZ.C rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof U4)) {
                return false;
            }
            U4 u4 = (U4) obj;
            return Intrinsics.areEqual(this.f8457n, u4.f8457n) && this.rl == u4.rl;
        }

        public U4(String str, rWZ.C layerType) {
            Intrinsics.checkNotNullParameter(layerType, "layerType");
            this.f8457n = str;
            this.rl = layerType;
        }

        public int hashCode() {
            String str = this.f8457n;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "LayerParentingButtonTapped(projectId=" + this.f8457n + ", layerType=" + this.rl + ")";
        }
    }

    public static final class UGc implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.eO f8458n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UGc) && this.f8458n == ((UGc) obj).f8458n;
        }

        public UGc(rWZ.eO requestTriggerPoint) {
            Intrinsics.checkNotNullParameter(requestTriggerPoint, "requestTriggerPoint");
            this.f8458n = requestTriggerPoint;
        }

        public int hashCode() {
            return this.f8458n.hashCode();
        }

        public final rWZ.eO n() {
            return this.f8458n;
        }

        public String toString() {
            return "CloudUploadRequested(requestTriggerPoint=" + this.f8458n + ")";
        }
    }

    public static final class Um implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8459n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Um)) {
                return false;
            }
            Um um = (Um) obj;
            return Intrinsics.areEqual(this.f8459n, um.f8459n) && Intrinsics.areEqual(this.rl, um.rl);
        }

        public Um(String projectPackageId, String errorInfo) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            this.f8459n = projectPackageId;
            this.rl = errorInfo;
        }

        public int hashCode() {
            return (this.f8459n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "ProjectPackageImportFailed(projectPackageId=" + this.f8459n + ", errorInfo=" + this.rl + ")";
        }
    }

    public static final class V implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final V f8460n = new V();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof V);
        }

        public String toString() {
            return "MoreSampleProjectsButtonTapped";
        }

        private V() {
        }

        public int hashCode() {
            return -1286972425;
        }
    }

    public static final class V1 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8461n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof V1) && Intrinsics.areEqual(this.f8461n, ((V1) obj).f8461n);
        }

        public V1(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8461n = projectId;
        }

        public int hashCode() {
            return this.f8461n.hashCode();
        }

        public String toString() {
            return "LayerMenuButtonTapped(projectId=" + this.f8461n + ")";
        }
    }

    public static final class VY8 implements j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final xr.j f8462O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8463n;
        private final int nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SceneType f8464t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VY8)) {
                return false;
            }
            VY8 vy8 = (VY8) obj;
            return Intrinsics.areEqual(this.f8463n, vy8.f8463n) && Intrinsics.areEqual(this.rl, vy8.rl) && this.f8464t == vy8.f8464t && this.nr == vy8.nr && Intrinsics.areEqual(this.f8462O, vy8.f8462O);
        }

        public VY8(String projectPackageId, String projectId, SceneType projectType, int i2, xr.j templateEditorTriggerPoint) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectType, "projectType");
            Intrinsics.checkNotNullParameter(templateEditorTriggerPoint, "templateEditorTriggerPoint");
            this.f8463n = projectPackageId;
            this.rl = projectId;
            this.f8464t = projectType;
            this.nr = i2;
            this.f8462O = templateEditorTriggerPoint;
        }

        public int hashCode() {
            return (((((((this.f8463n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8464t.hashCode()) * 31) + Integer.hashCode(this.nr)) * 31) + this.f8462O.hashCode();
        }

        public String toString() {
            return "TemplateImportEditorOpened(projectPackageId=" + this.f8463n + ", projectId=" + this.rl + ", projectType=" + this.f8464t + ", originalMediaCount=" + this.nr + ", templateEditorTriggerPoint=" + this.f8462O + ")";
        }
    }

    public static final class Vgd implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8465n;
        private final rWZ.z rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vgd)) {
                return false;
            }
            Vgd vgd = (Vgd) obj;
            return Intrinsics.areEqual(this.f8465n, vgd.f8465n) && this.rl == vgd.rl;
        }

        public Vgd(String projectId, rWZ.z watermarkType) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(watermarkType, "watermarkType");
            this.f8465n = projectId;
            this.rl = watermarkType;
        }

        public int hashCode() {
            return (this.f8465n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "WatermarkTapped(projectId=" + this.f8465n + ", watermarkType=" + this.rl + ")";
        }
    }

    public static final class VoU implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final VoU f8466n = new VoU();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoU);
        }

        public String toString() {
            return "OnboardingSkipped";
        }

        private VoU() {
        }

        public int hashCode() {
            return -1284565355;
        }
    }

    public static final class W implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final EnumC1982eO f8467n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof W) && this.f8467n == ((W) obj).f8467n;
        }

        public int hashCode() {
            EnumC1982eO enumC1982eO = this.f8467n;
            if (enumC1982eO == null) {
                return 0;
            }
            return enumC1982eO.hashCode();
        }

        public final EnumC1982eO n() {
            return this.f8467n;
        }

        public String toString() {
            return "PaywallAlertShown(paywallType=" + this.f8467n + ")";
        }

        public W(EnumC1982eO enumC1982eO) {
            this.f8467n = enumC1982eO;
        }
    }

    public static final class Wre implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8468n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Wre) && Intrinsics.areEqual(this.f8468n, ((Wre) obj).f8468n);
        }

        public Wre(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8468n = projectId;
        }

        public int hashCode() {
            return this.f8468n.hashCode();
        }

        public String toString() {
            return "AddLayerButtonTapped(projectId=" + this.f8468n + ")";
        }
    }

    public static final class Xo implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Xo f8469n = new Xo();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Xo);
        }

        public String toString() {
            return "CloudDownloadRequested";
        }

        private Xo() {
        }

        public int hashCode() {
            return -343676911;
        }
    }

    public static final class Y5 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Y5 f8470n = new Y5();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Y5);
        }

        public String toString() {
            return "MembershipOptionsButtonTapped";
        }

        private Y5() {
        }

        public int hashCode() {
            return 926766182;
        }
    }

    public static final class YzO implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.n f8471n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof YzO) && Intrinsics.areEqual(this.f8471n, ((YzO) obj).f8471n);
        }

        public YzO(rWZ.n exportSnapshot) {
            Intrinsics.checkNotNullParameter(exportSnapshot, "exportSnapshot");
            this.f8471n = exportSnapshot;
        }

        public int hashCode() {
            return this.f8471n.hashCode();
        }

        public final rWZ.n n() {
            return this.f8471n;
        }

        public String toString() {
            return "ExportFlowStarted(exportSnapshot=" + this.f8471n + ")";
        }
    }

    public static final class Z implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Z f8472n = new Z();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Z);
        }

        public String toString() {
            return "CreatorProgramJoinButtonTapped";
        }

        private Z() {
        }

        public int hashCode() {
            return -611352192;
        }
    }

    public static final class Z5b implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.Pl f8473n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Z5b) && this.f8473n == ((Z5b) obj).f8473n;
        }

        public Z5b(rWZ.Pl signInPopupType) {
            Intrinsics.checkNotNullParameter(signInPopupType, "signInPopupType");
            this.f8473n = signInPopupType;
        }

        public int hashCode() {
            return this.f8473n.hashCode();
        }

        public final rWZ.Pl n() {
            return this.f8473n;
        }

        public String toString() {
            return "SignInPopupDismissed(signInPopupType=" + this.f8473n + ")";
        }
    }

    public static final class ZX7 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8474n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZX7)) {
                return false;
            }
            ZX7 zx7 = (ZX7) obj;
            return Intrinsics.areEqual(this.f8474n, zx7.f8474n) && Intrinsics.areEqual(this.rl, zx7.rl);
        }

        public ZX7(String hook, String answerSelected) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            Intrinsics.checkNotNullParameter(answerSelected, "answerSelected");
            this.f8474n = hook;
            this.rl = answerSelected;
        }

        public int hashCode() {
            return (this.f8474n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "SurveyTapped(hook=" + this.f8474n + ", answerSelected=" + this.rl + ")";
        }
    }

    public static final class ZhI implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8475n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ZhI) && Intrinsics.areEqual(this.f8475n, ((ZhI) obj).f8475n);
        }

        public ZhI(String hook) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            this.f8475n = hook;
        }

        public int hashCode() {
            return this.f8475n.hashCode();
        }

        public String toString() {
            return "SurveyDismissed(hook=" + this.f8475n + ")";
        }
    }

    public static final class Zs implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8476n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Zs) && Intrinsics.areEqual(this.f8476n, ((Zs) obj).f8476n);
        }

        public Zs(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8476n = projectId;
        }

        public int hashCode() {
            return this.f8476n.hashCode();
        }

        public String toString() {
            return "EffectSearchButtonTapped(projectId=" + this.f8476n + ")";
        }
    }

    public static final class a implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8477n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f8477n, aVar.f8477n) && Intrinsics.areEqual(this.rl, aVar.rl);
        }

        public a(String projectPackageId, String projectPackageAuthorFirebaseId) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectPackageAuthorFirebaseId, "projectPackageAuthorFirebaseId");
            this.f8477n = projectPackageId;
            this.rl = projectPackageAuthorFirebaseId;
        }

        public int hashCode() {
            return (this.f8477n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "ProjectPackageImportFlowStarted(projectPackageId=" + this.f8477n + ", projectPackageAuthorFirebaseId=" + this.rl + ")";
        }
    }

    public static final class aC implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8478n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof aC) && Intrinsics.areEqual(this.f8478n, ((aC) obj).f8478n);
        }

        public int hashCode() {
            String str = this.f8478n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "BlendingAndOpacityButtonTapped(projectId=" + this.f8478n + ")";
        }

        public aC(String str) {
            this.f8478n = str;
        }
    }

    public static final class afV implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8479n;
        private final rWZ.C rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof afV)) {
                return false;
            }
            afV afv = (afV) obj;
            return Intrinsics.areEqual(this.f8479n, afv.f8479n) && this.rl == afv.rl;
        }

        public afV(String str, rWZ.C layerType) {
            Intrinsics.checkNotNullParameter(layerType, "layerType");
            this.f8479n = str;
            this.rl = layerType;
        }

        public int hashCode() {
            String str = this.f8479n;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "SpeedButtonTapped(projectId=" + this.f8479n + ", layerType=" + this.rl + ")";
        }
    }

    public static final class afx implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final afx f8480n = new afx();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof afx);
        }

        public String toString() {
            return "CreatorProgramInsufficientTokensAlertShown";
        }

        private afx() {
        }

        public int hashCode() {
            return -601811126;
        }
    }

    /* JADX INFO: renamed from: QmE.j$b, reason: case insensitive filesystem */
    public static final class C1436b implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8481n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1436b) && Intrinsics.areEqual(this.f8481n, ((C1436b) obj).f8481n);
        }

        public C1436b(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8481n = projectId;
        }

        public int hashCode() {
            return this.f8481n.hashCode();
        }

        public String toString() {
            return "SelectAllLayersTapped(projectId=" + this.f8481n + ")";
        }
    }

    public static final class bwY implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8482n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof bwY) && Intrinsics.areEqual(this.f8482n, ((bwY) obj).f8482n);
        }

        public bwY(String subTab) {
            Intrinsics.checkNotNullParameter(subTab, "subTab");
            this.f8482n = subTab;
        }

        public int hashCode() {
            return this.f8482n.hashCode();
        }

        public String toString() {
            return "SubTabOpened(subTab=" + this.f8482n + ")";
        }
    }

    /* JADX INFO: renamed from: QmE.j$c, reason: case insensitive filesystem */
    public static final class C1437c implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1437c f8483n = new C1437c();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1437c);
        }

        public String toString() {
            return "CloudUploadFlowStarted";
        }

        private C1437c() {
        }

        public int hashCode() {
            return 1818502909;
        }
    }

    public static final class c7r implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8484n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c7r) && Intrinsics.areEqual(this.f8484n, ((c7r) obj).f8484n);
        }

        public c7r(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.f8484n = link;
        }

        public int hashCode() {
            return this.f8484n.hashCode();
        }

        public String toString() {
            return "HomeFeedPostOpened(link=" + this.f8484n + ")";
        }
    }

    public static final class cA implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final cA f8485n = new cA();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof cA);
        }

        public String toString() {
            return "ImportXmlFailed";
        }

        private cA() {
        }

        public int hashCode() {
            return -514364657;
        }
    }

    public static final class cF implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final cF f8486n = new cF();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof cF);
        }

        public String toString() {
            return "TemplateSharingToggleOff";
        }

        private cF() {
        }

        public int hashCode() {
            return -204506471;
        }
    }

    public static final class ci implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final o.C f8487n;

        public ci(o.C rewardType) {
            Intrinsics.checkNotNullParameter(rewardType, "rewardType");
            this.f8487n = rewardType;
        }
    }

    public static final class crp implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8488n;
        private final rWZ.C rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof crp)) {
                return false;
            }
            crp crpVar = (crp) obj;
            return Intrinsics.areEqual(this.f8488n, crpVar.f8488n) && this.rl == crpVar.rl;
        }

        public crp(String str, rWZ.C layerType) {
            Intrinsics.checkNotNullParameter(layerType, "layerType");
            this.f8488n = str;
            this.rl = layerType;
        }

        public int hashCode() {
            String str = this.f8488n;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "KeyframeAdded(projectId=" + this.f8488n + ", layerType=" + this.rl + ")";
        }
    }

    /* JADX INFO: renamed from: QmE.j$dT, reason: case insensitive filesystem */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class C1438dT implements j {
        private final List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final mg4.w6 f8489O;
        private final EnumC1982eO Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8490n;
        private final boolean nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f8491t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1438dT)) {
                return false;
            }
            C1438dT c1438dT = (C1438dT) obj;
            return Intrinsics.areEqual(this.f8490n, c1438dT.f8490n) && Intrinsics.areEqual(this.rl, c1438dT.rl) && this.f8491t == c1438dT.f8491t && this.nr == c1438dT.nr && this.f8489O == c1438dT.f8489O && Intrinsics.areEqual(this.J2, c1438dT.J2) && this.Uo == c1438dT.Uo;
        }

        public C1438dT(String productId, String str, int i2, boolean z2, mg4.w6 subscriptionTier, List availableProducts, EnumC1982eO enumC1982eO) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(subscriptionTier, "subscriptionTier");
            Intrinsics.checkNotNullParameter(availableProducts, "availableProducts");
            this.f8490n = productId;
            this.rl = str;
            this.f8491t = i2;
            this.nr = z2;
            this.f8489O = subscriptionTier;
            this.J2 = availableProducts;
            this.Uo = enumC1982eO;
        }

        public final mg4.w6 J2() {
            return this.f8489O;
        }

        public final String O() {
            return this.f8490n;
        }

        public final boolean Uo() {
            return this.nr;
        }

        public int hashCode() {
            int iHashCode = this.f8490n.hashCode() * 31;
            String str = this.rl;
            int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f8491t)) * 31) + Boolean.hashCode(this.nr)) * 31) + this.f8489O.hashCode()) * 31) + this.J2.hashCode()) * 31;
            EnumC1982eO enumC1982eO = this.Uo;
            return iHashCode2 + (enumC1982eO != null ? enumC1982eO.hashCode() : 0);
        }

        public final List n() {
            return this.J2;
        }

        public final EnumC1982eO nr() {
            return this.Uo;
        }

        public final String rl() {
            return this.rl;
        }

        public final int t() {
            return this.f8491t;
        }

        public String toString() {
            return "MonetizationPurchaseCompleted(productId=" + this.f8490n + ", hook=" + this.rl + ", numberOfSessions=" + this.f8491t + ", isFirstPaywall=" + this.nr + ", subscriptionTier=" + this.f8489O + LHbnkhI.UmLffvMRZk + this.J2 + ", paywallType=" + this.Uo + ")";
        }
    }

    /* JADX INFO: renamed from: QmE.j$dc, reason: case insensitive filesystem */
    public static final class C1439dc implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final M.CN3 f8492n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1439dc) && this.f8492n == ((C1439dc) obj).f8492n;
        }

        public C1439dc(M.CN3 tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            this.f8492n = tab;
        }

        public int hashCode() {
            return this.f8492n.hashCode();
        }

        public String toString() {
            return "TabOpened(tab=" + this.f8492n + ")";
        }
    }

    public static final class dd implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Exception f8493n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dd) && Intrinsics.areEqual(this.f8493n, ((dd) obj).f8493n);
        }

        public dd(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f8493n = exception;
        }

        public int hashCode() {
            return this.f8493n.hashCode();
        }

        public final Exception n() {
            return this.f8493n;
        }

        public String toString() {
            return "SignOutFailed(exception=" + this.f8493n + ")";
        }
    }

    public static final class din implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8494n;
        private final rWZ.C rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof din)) {
                return false;
            }
            din dinVar = (din) obj;
            return Intrinsics.areEqual(this.f8494n, dinVar.f8494n) && this.rl == dinVar.rl;
        }

        public din(String projectId, rWZ.C layerType) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(layerType, "layerType");
            this.f8494n = projectId;
            this.rl = layerType;
        }

        public int hashCode() {
            return (this.f8494n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "SingleLayerSelected(projectId=" + this.f8494n + ", layerType=" + this.rl + ")";
        }
    }

    public static final class e implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final e f8495n = new e();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public String toString() {
            return "TemplateSharingToggleOn";
        }

        private e() {
        }

        public int hashCode() {
            return -837880971;
        }
    }

    public static final class eO implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final eO f8496n = new eO();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eO);
        }

        public String toString() {
            return "CloudProjectDeleted";
        }

        private eO() {
        }

        public int hashCode() {
            return 120093269;
        }
    }

    public static final class eZk implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8497n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eZk) && Intrinsics.areEqual(this.f8497n, ((eZk) obj).f8497n);
        }

        public eZk(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8497n = projectId;
        }

        public int hashCode() {
            return this.f8497n.hashCode();
        }

        public String toString() {
            return "PasteStyleTapped(projectId=" + this.f8497n + ")";
        }
    }

    public static final class eh implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.Xo f8498n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eh) && this.f8498n == ((eh) obj).f8498n;
        }

        public eh(rWZ.Xo signInPosition) {
            Intrinsics.checkNotNullParameter(signInPosition, "signInPosition");
            this.f8498n = signInPosition;
        }

        public int hashCode() {
            return this.f8498n.hashCode();
        }

        public final rWZ.Xo n() {
            return this.f8498n;
        }

        public String toString() {
            return "SignInButtonTapped(signInPosition=" + this.f8498n + ")";
        }
    }

    public static final class epX implements j {
        private final xr.j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f8499O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8500n;
        private final int nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SceneType f8501t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof epX)) {
                return false;
            }
            epX epx = (epX) obj;
            return Intrinsics.areEqual(this.f8500n, epx.f8500n) && Intrinsics.areEqual(this.rl, epx.rl) && this.f8501t == epx.f8501t && this.nr == epx.nr && this.f8499O == epx.f8499O && Intrinsics.areEqual(this.J2, epx.J2);
        }

        public epX(String projectPackageId, String projectId, SceneType projectType, int i2, int i3, xr.j templateEditorTriggerPoint) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectType, "projectType");
            Intrinsics.checkNotNullParameter(templateEditorTriggerPoint, "templateEditorTriggerPoint");
            this.f8500n = projectPackageId;
            this.rl = projectId;
            this.f8501t = projectType;
            this.nr = i2;
            this.f8499O = i3;
            this.J2 = templateEditorTriggerPoint;
        }

        public int hashCode() {
            return (((((((((this.f8500n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8501t.hashCode()) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f8499O)) * 31) + this.J2.hashCode();
        }

        public String toString() {
            return "TemplateImportClosed(projectPackageId=" + this.f8500n + ", projectId=" + this.rl + ", projectType=" + this.f8501t + ", originalMediaCount=" + this.nr + ", replacedMediaCount=" + this.f8499O + ", templateEditorTriggerPoint=" + this.J2 + ")";
        }
    }

    public static final class f implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8502n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f8502n, ((f) obj).f8502n);
        }

        public f(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8502n = projectId;
        }

        public int hashCode() {
            return this.f8502n.hashCode();
        }

        public String toString() {
            return "WatermarkRemoveButtonTapped(projectId=" + this.f8502n + ")";
        }
    }

    public static final class fg implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8503n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof fg) && Intrinsics.areEqual(this.f8503n, ((fg) obj).f8503n);
        }

        public fg(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8503n = projectId;
        }

        public int hashCode() {
            return this.f8503n.hashCode();
        }

        public String toString() {
            return "ElementClosed(projectId=" + this.f8503n + ")";
        }
    }

    public static final class fhj implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8504n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof fhj) && Intrinsics.areEqual(this.f8504n, ((fhj) obj).f8504n);
        }

        public fhj(String hook) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            this.f8504n = hook;
        }

        public int hashCode() {
            return this.f8504n.hashCode();
        }

        public String toString() {
            return "SurveyBackButtonTapped(hook=" + this.f8504n + ")";
        }
    }

    public static final class fuX implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8505n;
        private final Bundle rl;

        public fuX(String name, Bundle bundle) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f8505n = name;
            this.rl = bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof fuX)) {
                return false;
            }
            fuX fux = (fuX) obj;
            return Intrinsics.areEqual(this.f8505n, fux.f8505n) && Intrinsics.areEqual(this.rl, fux.rl);
        }

        public int hashCode() {
            int iHashCode = this.f8505n.hashCode() * 31;
            Bundle bundle = this.rl;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public final Bundle n() {
            return this.rl;
        }

        public final String rl() {
            return this.f8505n;
        }

        public String toString() {
            return "AnalyticsLog(name=" + this.f8505n + ", bundle=" + this.rl + ")";
        }

        public /* synthetic */ fuX(String str, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : bundle);
        }
    }

    public static final class g implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final g f8506n = new g();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public String toString() {
            return "RankingTosPPAccepted";
        }

        private g() {
        }

        public int hashCode() {
            return 1630263945;
        }
    }

    public static final class g62 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final g62 f8507n = new g62();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g62);
        }

        public String toString() {
            return "SeeTheRankingButtonTapped";
        }

        private g62() {
        }

        public int hashCode() {
            return 1555079606;
        }
    }

    public static final class g9 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final g9 f8508n = new g9();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g9);
        }

        public String toString() {
            return "ImportXmlStarted";
        }

        private g9() {
        }

        public int hashCode() {
            return 423969775;
        }
    }

    public static final class g9s implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final g9s f8509n = new g9s();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g9s);
        }

        public String toString() {
            return "CreatorProgramClaimButtonTapped";
        }

        private g9s() {
        }

        public int hashCode() {
            return 921681634;
        }
    }

    public static final class giR implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final giR f8510n = new giR();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof giR);
        }

        public String toString() {
            return "RankingOptOutButtonTapped";
        }

        private giR() {
        }

        public int hashCode() {
            return -1860078481;
        }
    }

    public static final class gnv implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8511n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gnv) && Intrinsics.areEqual(this.f8511n, ((gnv) obj).f8511n);
        }

        public int hashCode() {
            String str = this.f8511n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsTextButtonTapped(projectId=" + this.f8511n + ")";
        }

        public gnv(String str) {
            this.f8511n = str;
        }
    }

    /* JADX INFO: renamed from: QmE.j$h, reason: case insensitive filesystem */
    public static final class C1440h implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8512n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1440h) && Intrinsics.areEqual(this.f8512n, ((C1440h) obj).f8512n);
        }

        public int hashCode() {
            String str = this.f8512n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EditShapeButtonTapped(projectId=" + this.f8512n + ")";
        }

        public C1440h(String str) {
            this.f8512n = str;
        }
    }

    public static final class h6y implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final h6y f8513n = new h6y();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h6y);
        }

        public String toString() {
            return "ManageSubscriptionButtonTapped";
        }

        private h6y() {
        }

        public int hashCode() {
            return 41028256;
        }
    }

    public static final class hQ implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8514n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof hQ) && Intrinsics.areEqual(this.f8514n, ((hQ) obj).f8514n);
        }

        public hQ(String sku) {
            Intrinsics.checkNotNullParameter(sku, "sku");
            this.f8514n = sku;
        }

        public int hashCode() {
            return this.f8514n.hashCode();
        }

        public final String n() {
            return this.f8514n;
        }

        public String toString() {
            return "GetSubscriptionFailed(sku=" + this.f8514n + ")";
        }
    }

    /* JADX INFO: renamed from: QmE.j$i, reason: case insensitive filesystem */
    public static final class C1441i implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8515n;
        private final rWZ.o rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1441i)) {
                return false;
            }
            C1441i c1441i = (C1441i) obj;
            return Intrinsics.areEqual(this.f8515n, c1441i.f8515n) && this.rl == c1441i.rl;
        }

        public C1441i(String contentItemId, rWZ.o location) {
            Intrinsics.checkNotNullParameter(contentItemId, "contentItemId");
            Intrinsics.checkNotNullParameter(location, "location");
            this.f8515n = contentItemId;
            this.rl = location;
        }

        public int hashCode() {
            return (this.f8515n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "MdtContentLibraryContentItemTapped(contentItemId=" + this.f8515n + ", location=" + this.rl + ")";
        }
    }

    public static final class iF implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8516n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iF) && Intrinsics.areEqual(this.f8516n, ((iF) obj).f8516n);
        }

        public int hashCode() {
            String str = this.f8516n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsButtonTapped(projectId=" + this.f8516n + ")";
        }

        public iF(String str) {
            this.f8516n = str;
        }
    }

    public static final class ibE implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final ibE f8517n = new ibE();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ibE);
        }

        public String toString() {
            return "PlayfulUnlockFtUiShown";
        }

        private ibE() {
        }

        public int hashCode() {
            return -838316990;
        }
    }

    public static final class iwV implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final JSONObject f8518n;

        public iwV(JSONObject appInfo) {
            Intrinsics.checkNotNullParameter(appInfo, "appInfo");
            this.f8518n = appInfo;
        }

        public final JSONObject n() {
            return this.f8518n;
        }
    }

    public static final class iy implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8519n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iy) && Intrinsics.areEqual(this.f8519n, ((iy) obj).f8519n);
        }

        public int hashCode() {
            String str = this.f8519n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String n() {
            return this.f8519n;
        }

        public String toString() {
            return "SignInCompleted(provider=" + this.f8519n + ")";
        }

        public iy(String str) {
            this.f8519n = str;
        }
    }

    /* JADX INFO: renamed from: QmE.j$j, reason: collision with other inner class name */
    public static final class C0292j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8520n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0292j)) {
                return false;
            }
            C0292j c0292j = (C0292j) obj;
            return Intrinsics.areEqual(this.f8520n, c0292j.f8520n) && Intrinsics.areEqual(this.rl, c0292j.rl);
        }

        public C0292j(String str, String errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            this.f8520n = str;
            this.rl = errorCode;
        }

        public int hashCode() {
            String str = this.f8520n;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode();
        }

        public final String n() {
            return this.f8520n;
        }

        public final String rl() {
            return this.rl;
        }

        public String toString() {
            return "AcceptCreatorProgramUseCaseError(description=" + this.f8520n + ", errorCode=" + this.rl + ")";
        }
    }

    public static final class jL implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8521n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jL) && Intrinsics.areEqual(this.f8521n, ((jL) obj).f8521n);
        }

        public jL(String projectPackageId) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            this.f8521n = projectPackageId;
        }

        public int hashCode() {
            return this.f8521n.hashCode();
        }

        public String toString() {
            return "PresetImportCrisperPopupShow(projectPackageId=" + this.f8521n + ")";
        }
    }

    public static final class kO4 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final kO4 f8522n = new kO4();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kO4);
        }

        public String toString() {
            return "FAQRankingButtonClicked";
        }

        private kO4() {
        }

        public int hashCode() {
            return 827815477;
        }
    }

    public static final class l implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8523n;
        private final rWZ.qz nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final rWZ.C f8524t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.areEqual(this.f8523n, lVar.f8523n) && Intrinsics.areEqual(this.rl, lVar.rl) && this.f8524t == lVar.f8524t && this.nr == lVar.nr;
        }

        public l(String str, String presetId, rWZ.C c2, rWZ.qz location) {
            Intrinsics.checkNotNullParameter(presetId, "presetId");
            Intrinsics.checkNotNullParameter(location, "location");
            this.f8523n = str;
            this.rl = presetId;
            this.f8524t = c2;
            this.nr = location;
        }

        public int hashCode() {
            String str = this.f8523n;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode()) * 31;
            rWZ.C c2 = this.f8524t;
            return ((iHashCode + (c2 != null ? c2.hashCode() : 0)) * 31) + this.nr.hashCode();
        }

        public String toString() {
            return "PresetTapped(projectId=" + this.f8523n + ", presetId=" + this.rl + ", layerType=" + this.f8524t + ", location=" + this.nr + ")";
        }
    }

    public static final class l3D implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8525n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l3D) && Intrinsics.areEqual(this.f8525n, ((l3D) obj).f8525n);
        }

        public l3D(String errorKind) {
            Intrinsics.checkNotNullParameter(errorKind, "errorKind");
            this.f8525n = errorKind;
        }

        public int hashCode() {
            return this.f8525n.hashCode();
        }

        public final String n() {
            return this.f8525n;
        }

        public String toString() {
            return "CloudUploadFailed(errorKind=" + this.f8525n + ")";
        }
    }

    public static final class l4Z implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8526n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l4Z) && Intrinsics.areEqual(this.f8526n, ((l4Z) obj).f8526n);
        }

        public int hashCode() {
            String str = this.f8526n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsMatteMaskKeyButtonTapped(projectId=" + this.f8526n + ")";
        }

        public l4Z(String str) {
            this.f8526n = str;
        }
    }

    public static final class lS implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f8527n;
        private final int rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lS)) {
                return false;
            }
            lS lSVar = (lS) obj;
            return this.f8527n == lSVar.f8527n && this.rl == lSVar.rl;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f8527n) * 31) + Integer.hashCode(this.rl);
        }

        public String toString() {
            return "MaxResolutionCheckCompleted(maxResolution=" + this.f8527n + ", maxResolutionNoVideo=" + this.rl + ")";
        }

        public lS(int i2, int i3) {
            this.f8527n = i2;
            this.rl = i3;
        }
    }

    public static final class lej implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8528n;

        public lej(String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            this.f8528n = script;
        }

        public final String n() {
            return this.f8528n;
        }
    }

    /* JADX INFO: renamed from: QmE.j$m, reason: case insensitive filesystem */
    public static final class C1442m implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8529n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1442m) && Intrinsics.areEqual(this.f8529n, ((C1442m) obj).f8529n);
        }

        public int hashCode() {
            String str = this.f8529n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsBlurButtonTapped(projectId=" + this.f8529n + ")";
        }

        public C1442m(String str) {
            this.f8529n = str;
        }
    }

    public static final class m8h implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8530n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m8h) && Intrinsics.areEqual(this.f8530n, ((m8h) obj).f8530n);
        }

        public m8h(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8530n = projectId;
        }

        public int hashCode() {
            return this.f8530n.hashCode();
        }

        public final String n() {
            return this.f8530n;
        }

        public String toString() {
            return "ProjectOpened(projectId=" + this.f8530n + ")";
        }
    }

    public static final class mrQ implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final mrQ f8531n = new mrQ();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof mrQ);
        }

        public String toString() {
            return "MdtContentLibraryClosed";
        }

        private mrQ() {
        }

        public int hashCode() {
            return -983405205;
        }
    }

    public static final class mz implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8532n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof mz) && Intrinsics.areEqual(this.f8532n, ((mz) obj).f8532n);
        }

        public int hashCode() {
            String str = this.f8532n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsMoveTransformButtonTapped(projectId=" + this.f8532n + ")";
        }

        public mz(String str) {
            this.f8532n = str;
        }
    }

    /* JADX INFO: renamed from: QmE.j$n, reason: case insensitive filesystem */
    public static final class C1443n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1443n f8533n = new C1443n();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1443n);
        }

        public String toString() {
            return "AccountDeletionCompleted";
        }

        private C1443n() {
        }

        public int hashCode() {
            return -315114128;
        }
    }

    public static final class nH implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.n f8534n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nH) && Intrinsics.areEqual(this.f8534n, ((nH) obj).f8534n);
        }

        public nH(rWZ.n exportSnapshot) {
            Intrinsics.checkNotNullParameter(exportSnapshot, "exportSnapshot");
            this.f8534n = exportSnapshot;
        }

        public int hashCode() {
            return this.f8534n.hashCode();
        }

        public String toString() {
            return "ProjectPackageSaved(exportSnapshot=" + this.f8534n + ")";
        }
    }

    public static final class nKK implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final F2p.Ml f8535n;

        public nKK(F2p.Ml qaType) {
            Intrinsics.checkNotNullParameter(qaType, "qaType");
            this.f8535n = qaType;
        }
    }

    public static final class nSC implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final nSC f8536n = new nSC();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nSC);
        }

        public String toString() {
            return "MissingMediaAlertShown";
        }

        private nSC() {
        }

        public int hashCode() {
            return -1705529389;
        }
    }

    public static final class nr implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final nr f8537n = new nr();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nr);
        }

        public String toString() {
            return "RankingEditProfileButtonTapped";
        }

        private nr() {
        }

        public int hashCode() {
            return -1918087385;
        }
    }

    /* JADX INFO: renamed from: QmE.j$o, reason: case insensitive filesystem */
    public static final class C1444o implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1444o f8538n = new C1444o();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1444o);
        }

        public String toString() {
            return "CloudDownloadCancelled";
        }

        private C1444o() {
        }

        public int hashCode() {
            return -561022476;
        }
    }

    public static final class o7q implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8539n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o7q) && Intrinsics.areEqual(this.f8539n, ((o7q) obj).f8539n);
        }

        public int hashCode() {
            String str = this.f8539n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ElementPropertiesButtonTapped(projectId=" + this.f8539n + ")";
        }

        public o7q(String str) {
            this.f8539n = str;
        }
    }

    public static final class oJ implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final oJ f8540n = new oJ();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof oJ);
        }

        public String toString() {
            return "PresetEmptyStateCrisperPopupShow";
        }

        private oJ() {
        }

        public int hashCode() {
            return -209945304;
        }
    }

    public static final class oXP implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8541n;
        private final rWZ.C rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final rWZ.C f8542t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oXP)) {
                return false;
            }
            oXP oxp = (oXP) obj;
            return Intrinsics.areEqual(this.f8541n, oxp.f8541n) && this.rl == oxp.rl && this.f8542t == oxp.f8542t;
        }

        public oXP(String str, rWZ.C parentLayerType, rWZ.C childLayerType) {
            Intrinsics.checkNotNullParameter(parentLayerType, "parentLayerType");
            Intrinsics.checkNotNullParameter(childLayerType, "childLayerType");
            this.f8541n = str;
            this.rl = parentLayerType;
            this.f8542t = childLayerType;
        }

        public int hashCode() {
            String str = this.f8541n;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode()) * 31) + this.f8542t.hashCode();
        }

        public String toString() {
            return "LayerParentingAdded(projectId=" + this.f8541n + ", parentLayerType=" + this.rl + ", childLayerType=" + this.f8542t + ")";
        }
    }

    public static final class op implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8543n;
        private final rWZ.C rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof op)) {
                return false;
            }
            op opVar = (op) obj;
            return Intrinsics.areEqual(this.f8543n, opVar.f8543n) && this.rl == opVar.rl;
        }

        public op(String projectId, rWZ.C layerType) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(layerType, "layerType");
            this.f8543n = projectId;
            this.rl = layerType;
        }

        public int hashCode() {
            return (this.f8543n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "SavePresetButtonTapped(projectId=" + this.f8543n + ", layerType=" + this.rl + ")";
        }
    }

    public static final class ozJ implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8544n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ozJ)) {
                return false;
            }
            ozJ ozj = (ozJ) obj;
            return Intrinsics.areEqual(this.f8544n, ozj.f8544n) && Intrinsics.areEqual(this.rl, ozj.rl);
        }

        public ozJ(String productId, String str) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f8544n = productId;
            this.rl = str;
        }

        public int hashCode() {
            int iHashCode = this.f8544n.hashCode() * 31;
            String str = this.rl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String n() {
            return this.rl;
        }

        public final String rl() {
            return this.f8544n;
        }

        public String toString() {
            return "MonetizationPurchaseCanceled(productId=" + this.f8544n + ", hook=" + this.rl + ")";
        }
    }

    /* JADX INFO: renamed from: QmE.j$p, reason: case insensitive filesystem */
    public static final class C1445p implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8545n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1445p) && Intrinsics.areEqual(this.f8545n, ((C1445p) obj).f8545n);
        }

        public int hashCode() {
            String str = this.f8545n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsOtherButtonTapped(projectId=" + this.f8545n + ")";
        }

        public C1445p(String str) {
            this.f8545n = str;
        }
    }

    public static final class pIF implements j {
        private final xr.j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final tu.Ew f8546O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8547n;
        private final tu.Ew nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SceneType f8548t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof pIF)) {
                return false;
            }
            pIF pif = (pIF) obj;
            return Intrinsics.areEqual(this.f8547n, pif.f8547n) && Intrinsics.areEqual(this.rl, pif.rl) && this.f8548t == pif.f8548t && this.nr == pif.nr && this.f8546O == pif.f8546O && Intrinsics.areEqual(this.J2, pif.J2);
        }

        public pIF(String projectPackageId, String projectId, SceneType projectType, tu.Ew originalMediaType, tu.Ew replacedMediaType, xr.j templateEditorTriggerPoint) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectType, "projectType");
            Intrinsics.checkNotNullParameter(originalMediaType, "originalMediaType");
            Intrinsics.checkNotNullParameter(replacedMediaType, "replacedMediaType");
            Intrinsics.checkNotNullParameter(templateEditorTriggerPoint, "templateEditorTriggerPoint");
            this.f8547n = projectPackageId;
            this.rl = projectId;
            this.f8548t = projectType;
            this.nr = originalMediaType;
            this.f8546O = replacedMediaType;
            this.J2 = templateEditorTriggerPoint;
        }

        public int hashCode() {
            return (((((((((this.f8547n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8548t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f8546O.hashCode()) * 31) + this.J2.hashCode();
        }

        public String toString() {
            return "TemplateImportMediaReplaced(projectPackageId=" + this.f8547n + ", projectId=" + this.rl + ", projectType=" + this.f8548t + ", originalMediaType=" + this.nr + ", replacedMediaType=" + this.f8546O + ", templateEditorTriggerPoint=" + this.J2 + ")";
        }
    }

    public static final class pO implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8549n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pO) && Intrinsics.areEqual(this.f8549n, ((pO) obj).f8549n);
        }

        public int hashCode() {
            String str = this.f8549n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsDistortionWarpButtonTapped(projectId=" + this.f8549n + ")";
        }

        public pO(String str) {
            this.f8549n = str;
        }
    }

    public static final class pq implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.CN3 f8550n;
        private final String[] nr;
        private final rWZ.Dsr rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final rWZ.fuX f8551t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof pq)) {
                return false;
            }
            pq pqVar = (pq) obj;
            return this.f8550n == pqVar.f8550n && this.rl == pqVar.rl && this.f8551t == pqVar.f8551t && Intrinsics.areEqual(this.nr, pqVar.nr);
        }

        public pq(rWZ.CN3 externalStorageAuthorization, rWZ.Dsr authorizationType, rWZ.fuX location, String[] strArr) {
            Intrinsics.checkNotNullParameter(externalStorageAuthorization, "externalStorageAuthorization");
            Intrinsics.checkNotNullParameter(authorizationType, "authorizationType");
            Intrinsics.checkNotNullParameter(location, "location");
            this.f8550n = externalStorageAuthorization;
            this.rl = authorizationType;
            this.f8551t = location;
            this.nr = strArr;
        }

        public int hashCode() {
            int iHashCode = ((((this.f8550n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8551t.hashCode()) * 31;
            String[] strArr = this.nr;
            return iHashCode + (strArr == null ? 0 : Arrays.hashCode(strArr));
        }

        public String toString() {
            return "ExternalStorageAuthorizationResponseGiven(externalStorageAuthorization=" + this.f8550n + ", authorizationType=" + this.rl + ", location=" + this.f8551t + ", projectIds=" + Arrays.toString(this.nr) + ")";
        }
    }

    public static final class psW implements j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f8552O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8553n;
        private final rWZ.C nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f8554t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof psW)) {
                return false;
            }
            psW psw = (psW) obj;
            return Intrinsics.areEqual(this.f8553n, psw.f8553n) && Intrinsics.areEqual(this.rl, psw.rl) && this.f8554t == psw.f8554t && this.nr == psw.nr && this.f8552O == psw.f8552O;
        }

        public psW(String projectId, String effectName, boolean z2, rWZ.C layerType, boolean z3) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(effectName, "effectName");
            Intrinsics.checkNotNullParameter(layerType, "layerType");
            this.f8553n = projectId;
            this.rl = effectName;
            this.f8554t = z2;
            this.nr = layerType;
            this.f8552O = z3;
        }

        public int hashCode() {
            return (((((((this.f8553n.hashCode() * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f8554t)) * 31) + this.nr.hashCode()) * 31) + Boolean.hashCode(this.f8552O);
        }

        public String toString() {
            return "EffectAdded(projectId=" + this.f8553n + ", effectName=" + this.rl + ", isPremiumEffect=" + this.f8554t + ", layerType=" + this.nr + ", isStandard=" + this.f8552O + ")";
        }
    }

    public static final class qYU implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final qYU f8555n = new qYU();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof qYU);
        }

        public String toString() {
            return "GettingStartedButtonTapped";
        }

        private qYU() {
        }

        public int hashCode() {
            return -265622629;
        }
    }

    public static final class qf implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final sqD.CN3 f8556n;

        public qf(sqD.CN3 hook) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            this.f8556n = hook;
        }

        public final sqD.CN3 n() {
            return this.f8556n;
        }
    }

    public static final class qfL implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final rWZ.Pl f8557n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof qfL) && this.f8557n == ((qfL) obj).f8557n;
        }

        public qfL(rWZ.Pl signInPopupType) {
            Intrinsics.checkNotNullParameter(signInPopupType, "signInPopupType");
            this.f8557n = signInPopupType;
        }

        public int hashCode() {
            return this.f8557n.hashCode();
        }

        public final rWZ.Pl n() {
            return this.f8557n;
        }

        public String toString() {
            return "SignInPopupShown(signInPopupType=" + this.f8557n + ")";
        }
    }

    public static final class qhS implements j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final xr.j f8558O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8559n;
        private final tu.Ew nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SceneType f8560t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof qhS)) {
                return false;
            }
            qhS qhs = (qhS) obj;
            return Intrinsics.areEqual(this.f8559n, qhs.f8559n) && Intrinsics.areEqual(this.rl, qhs.rl) && this.f8560t == qhs.f8560t && this.nr == qhs.nr && Intrinsics.areEqual(this.f8558O, qhs.f8558O);
        }

        public qhS(String projectPackageId, String projectId, SceneType projectType, tu.Ew originalMediaType, xr.j templateEditorTriggerPoint) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectType, "projectType");
            Intrinsics.checkNotNullParameter(originalMediaType, "originalMediaType");
            Intrinsics.checkNotNullParameter(templateEditorTriggerPoint, "templateEditorTriggerPoint");
            this.f8559n = projectPackageId;
            this.rl = projectId;
            this.f8560t = projectType;
            this.nr = originalMediaType;
            this.f8558O = templateEditorTriggerPoint;
        }

        public int hashCode() {
            return (((((((this.f8559n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8560t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f8558O.hashCode();
        }

        public String toString() {
            return "TemplateImportMediaSelected(projectPackageId=" + this.f8559n + ", projectId=" + this.rl + ", projectType=" + this.f8560t + ", originalMediaType=" + this.nr + ", templateEditorTriggerPoint=" + this.f8558O + ")";
        }
    }

    public static final class qiB implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8561n;
        private final List rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof qiB)) {
                return false;
            }
            qiB qib = (qiB) obj;
            return Intrinsics.areEqual(this.f8561n, qib.f8561n) && Intrinsics.areEqual(this.rl, qib.rl);
        }

        public qiB(String str, List layersType) {
            Intrinsics.checkNotNullParameter(layersType, "layersType");
            this.f8561n = str;
            this.rl = layersType;
        }

        public int hashCode() {
            String str = this.f8561n;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "UngroupLayerButtonTapped(projectId=" + this.f8561n + ", layersType=" + this.rl + ")";
        }
    }

    public static final class qz implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f8562n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof qz) && this.f8562n == ((qz) obj).f8562n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f8562n);
        }

        public final boolean n() {
            return this.f8562n;
        }

        public String toString() {
            return "CloudDownloadCompleted(isProjectOverridden=" + this.f8562n + ")";
        }

        public qz(boolean z2) {
            this.f8562n = z2;
        }
    }

    public static final class r implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8563n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Intrinsics.areEqual(this.f8563n, ((r) obj).f8563n);
        }

        public r(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8563n = projectId;
        }

        public int hashCode() {
            return this.f8563n.hashCode();
        }

        public String toString() {
            return "CopyLayerTapped(projectId=" + this.f8563n + ")";
        }
    }

    public static final class rd implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8564n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rd)) {
                return false;
            }
            rd rdVar = (rd) obj;
            return Intrinsics.areEqual(this.f8564n, rdVar.f8564n) && Intrinsics.areEqual(this.rl, rdVar.rl);
        }

        public rd(String str, String errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            this.f8564n = str;
            this.rl = errorCode;
        }

        public int hashCode() {
            String str = this.f8564n;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode();
        }

        public final String n() {
            return this.f8564n;
        }

        public final String rl() {
            return this.rl;
        }

        public String toString() {
            return "SetDeviceIdUseCaseError(description=" + this.f8564n + ", errorCode=" + this.rl + ")";
        }
    }

    public static final class rfW implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8565n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rfW) && Intrinsics.areEqual(this.f8565n, ((rfW) obj).f8565n);
        }

        public rfW(String hook) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            this.f8565n = hook;
        }

        public int hashCode() {
            return this.f8565n.hashCode();
        }

        public final String n() {
            return this.f8565n;
        }

        public String toString() {
            return "PopupShown(hook=" + this.f8565n + ")";
        }
    }

    public static final class rrk implements j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f8566O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8567n;
        private final int nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f8568t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rrk)) {
                return false;
            }
            rrk rrkVar = (rrk) obj;
            return Intrinsics.areEqual(this.f8567n, rrkVar.f8567n) && this.rl == rrkVar.rl && this.f8568t == rrkVar.f8568t && this.nr == rrkVar.nr && Intrinsics.areEqual(this.f8566O, rrkVar.f8566O);
        }

        public rrk(String projectId, int i2, int i3, int i5, String background) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(background, "background");
            this.f8567n = projectId;
            this.rl = i2;
            this.f8568t = i3;
            this.nr = i5;
            this.f8566O = background;
        }

        public final int O() {
            return this.rl;
        }

        public int hashCode() {
            return (((((((this.f8567n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f8568t)) * 31) + Integer.hashCode(this.nr)) * 31) + this.f8566O.hashCode();
        }

        public final String n() {
            return this.f8566O;
        }

        public final String nr() {
            return this.f8567n;
        }

        public final int rl() {
            return this.nr;
        }

        public final int t() {
            return this.f8568t;
        }

        public String toString() {
            return "ProjectCreated(projectId=" + this.f8567n + ", projectWidth=" + this.rl + ", projectHeight=" + this.f8568t + ", frameRate=" + this.nr + ", background=" + this.f8566O + ")";
        }
    }

    public static final class rv6 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8569n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rv6) && Intrinsics.areEqual(this.f8569n, ((rv6) obj).f8569n);
        }

        public int hashCode() {
            String str = this.f8569n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EditDrawingButtonTapped(projectId=" + this.f8569n + ")";
        }

        public rv6(String str) {
            this.f8569n = str;
        }
    }

    public static final class s4 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final s4 f8570n = new s4();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof s4);
        }

        public String toString() {
            return "CloudUploadMainButtonTapped";
        }

        private s4() {
        }

        public int hashCode() {
            return -171678867;
        }
    }

    public static final class s6u implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final s6u f8571n = new s6u();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof s6u);
        }

        public String toString() {
            return "OnboardingStarted";
        }

        private s6u() {
        }

        public int hashCode() {
            return -1034227738;
        }
    }

    /* JADX INFO: renamed from: QmE.j$t, reason: case insensitive filesystem */
    public static final class C1446t implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f8572n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final rWZ.QJ f8573t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1446t)) {
                return false;
            }
            C1446t c1446t = (C1446t) obj;
            return this.f8572n == c1446t.f8572n && this.rl == c1446t.rl && this.f8573t == c1446t.f8573t;
        }

        public C1446t(int i2, int i3, rWZ.QJ importSource) {
            Intrinsics.checkNotNullParameter(importSource, "importSource");
            this.f8572n = i2;
            this.rl = i3;
            this.f8573t = importSource;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f8572n) * 31) + Integer.hashCode(this.rl)) * 31) + this.f8573t.hashCode();
        }

        public String toString() {
            return "ImportXmlCompleted(numberImportsAttempted=" + this.f8572n + ", numberImportsCompleted=" + this.rl + ", importSource=" + this.f8573t + ")";
        }
    }

    public static final class t6 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8574n;
        private final EnumC1982eO nr;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f8575t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t6)) {
                return false;
            }
            t6 t6Var = (t6) obj;
            return Intrinsics.areEqual(this.f8574n, t6Var.f8574n) && Intrinsics.areEqual(this.rl, t6Var.rl) && this.f8575t == t6Var.f8575t && this.nr == t6Var.nr;
        }

        public t6(String str, List availableProducts, boolean z2, EnumC1982eO enumC1982eO) {
            Intrinsics.checkNotNullParameter(availableProducts, "availableProducts");
            this.f8574n = str;
            this.rl = availableProducts;
            this.f8575t = z2;
            this.nr = enumC1982eO;
        }

        public int hashCode() {
            String str = this.f8574n;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f8575t)) * 31;
            EnumC1982eO enumC1982eO = this.nr;
            return iHashCode + (enumC1982eO != null ? enumC1982eO.hashCode() : 0);
        }

        public final List n() {
            return this.rl;
        }

        public final boolean nr() {
            return this.f8575t;
        }

        public final String rl() {
            return this.f8574n;
        }

        public final EnumC1982eO t() {
            return this.nr;
        }

        public String toString() {
            return "PaywallDismissed(hook=" + this.f8574n + ", availableProducts=" + this.rl + ", withAndroidBackButton=" + this.f8575t + ", paywallType=" + this.nr + ")";
        }
    }

    public static final class tB implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final tB f8576n = new tB();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof tB);
        }

        public String toString() {
            return "YoutubeChannelButtonTapped";
        }

        private tB() {
        }

        public int hashCode() {
            return -530813218;
        }
    }

    public static final class tI implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final tI f8577n = new tI();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof tI);
        }

        public String toString() {
            return "MaximumQuotaAlertShown";
        }

        private tI() {
        }

        public int hashCode() {
            return 1559680365;
        }
    }

    public static final class tQj implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8578n;
        private final xr.j nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SceneType f8579t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof tQj)) {
                return false;
            }
            tQj tqj = (tQj) obj;
            return Intrinsics.areEqual(this.f8578n, tqj.f8578n) && Intrinsics.areEqual(this.rl, tqj.rl) && this.f8579t == tqj.f8579t && Intrinsics.areEqual(this.nr, tqj.nr);
        }

        public tQj(String projectPackageId, String projectId, SceneType projectType, xr.j templateEditorTriggerPoint) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectType, "projectType");
            Intrinsics.checkNotNullParameter(templateEditorTriggerPoint, "templateEditorTriggerPoint");
            this.f8578n = projectPackageId;
            this.rl = projectId;
            this.f8579t = projectType;
            this.nr = templateEditorTriggerPoint;
        }

        public int hashCode() {
            return (((((this.f8578n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8579t.hashCode()) * 31) + this.nr.hashCode();
        }

        public String toString() {
            return "TemplateImportClipSelectionEditorOpened(projectPackageId=" + this.f8578n + ", projectId=" + this.rl + ", projectType=" + this.f8579t + ", templateEditorTriggerPoint=" + this.nr + ")";
        }
    }

    public static final class tUY implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Exception f8580n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof tUY) && Intrinsics.areEqual(this.f8580n, ((tUY) obj).f8580n);
        }

        public tUY(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f8580n = exception;
        }

        public int hashCode() {
            return this.f8580n.hashCode();
        }

        public final Exception n() {
            return this.f8580n;
        }

        public String toString() {
            return "UnlinkAuthProviderFailed(exception=" + this.f8580n + ")";
        }
    }

    public static final class tZ implements j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final xr.j f8581O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8582n;
        private final tu.Ew nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SceneType f8583t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof tZ)) {
                return false;
            }
            tZ tZVar = (tZ) obj;
            return Intrinsics.areEqual(this.f8582n, tZVar.f8582n) && Intrinsics.areEqual(this.rl, tZVar.rl) && this.f8583t == tZVar.f8583t && this.nr == tZVar.nr && Intrinsics.areEqual(this.f8581O, tZVar.f8581O);
        }

        public tZ(String projectPackageId, String projectId, SceneType projectType, tu.Ew originalMediaType, xr.j templateEditorTriggerPoint) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectType, "projectType");
            Intrinsics.checkNotNullParameter(originalMediaType, "originalMediaType");
            Intrinsics.checkNotNullParameter(templateEditorTriggerPoint, "templateEditorTriggerPoint");
            this.f8582n = projectPackageId;
            this.rl = projectId;
            this.f8583t = projectType;
            this.nr = originalMediaType;
            this.f8581O = templateEditorTriggerPoint;
        }

        public int hashCode() {
            return (((((((this.f8582n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8583t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f8581O.hashCode();
        }

        public String toString() {
            return "TemplateImportMediaReplaceButtonTapped(projectPackageId=" + this.f8582n + ", projectId=" + this.rl + ", projectType=" + this.f8583t + ", originalMediaType=" + this.nr + ", templateEditorTriggerPoint=" + this.f8581O + ")";
        }
    }

    public static final class tmw implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8584n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final rWZ.C f8585t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof tmw)) {
                return false;
            }
            tmw tmwVar = (tmw) obj;
            return Intrinsics.areEqual(this.f8584n, tmwVar.f8584n) && Intrinsics.areEqual(this.rl, tmwVar.rl) && this.f8585t == tmwVar.f8585t;
        }

        public tmw(String projectId, String presetId, rWZ.C layerType) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(presetId, "presetId");
            Intrinsics.checkNotNullParameter(layerType, "layerType");
            this.f8584n = projectId;
            this.rl = presetId;
            this.f8585t = layerType;
        }

        public int hashCode() {
            return (((this.f8584n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8585t.hashCode();
        }

        public String toString() {
            return "PresetApplied(projectId=" + this.f8584n + ", presetId=" + this.rl + ", layerType=" + this.f8585t + ")";
        }
    }

    public static final class tpM implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8586n;
        private final rWZ.C rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof tpM)) {
                return false;
            }
            tpM tpm = (tpM) obj;
            return Intrinsics.areEqual(this.f8586n, tpm.f8586n) && this.rl == tpm.rl;
        }

        public int hashCode() {
            String str = this.f8586n;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            rWZ.C c2 = this.rl;
            return iHashCode + (c2 != null ? c2.hashCode() : 0);
        }

        public String toString() {
            return "PresetButtonTapped(projectId=" + this.f8586n + ", layerType=" + this.rl + ")";
        }

        public tpM(String str, rWZ.C c2) {
            this.f8586n = str;
            this.rl = c2;
        }
    }

    public static final class vd implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8589n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vd) && Intrinsics.areEqual(this.f8589n, ((vd) obj).f8589n);
        }

        public int hashCode() {
            String str = this.f8589n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EditGroupButtonTapped(projectId=" + this.f8589n + ")";
        }

        public vd(String str) {
            this.f8589n = str;
        }
    }

    public static final class w6 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Exception f8590n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && Intrinsics.areEqual(this.f8590n, ((w6) obj).f8590n);
        }

        public w6(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f8590n = exception;
        }

        public int hashCode() {
            return this.f8590n.hashCode();
        }

        public final Exception n() {
            return this.f8590n;
        }

        public String toString() {
            return "AccountDeletionFailed(exception=" + this.f8590n + ")";
        }
    }

    public static final class wb implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final wb f8591n = new wb();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wb);
        }

        public String toString() {
            return "TutorialIconTapped";
        }

        private wb() {
        }

        public int hashCode() {
            return 501722211;
        }
    }

    public static final class xTb implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8592n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof xTb) && Intrinsics.areEqual(this.f8592n, ((xTb) obj).f8592n);
        }

        public xTb(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8592n = projectId;
        }

        public int hashCode() {
            return this.f8592n.hashCode();
        }

        public final String n() {
            return this.f8592n;
        }

        public String toString() {
            return "ProjectClosed(projectId=" + this.f8592n + ")";
        }
    }

    public static final class xZD implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ga6.j f8593n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof xZD) && Intrinsics.areEqual(this.f8593n, ((xZD) obj).f8593n);
        }

        public xZD(ga6.j error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f8593n = error;
        }

        public int hashCode() {
            return this.f8593n.hashCode();
        }

        public final ga6.j n() {
            return this.f8593n;
        }

        public String toString() {
            return "ErrorOccurred(error=" + this.f8593n + ")";
        }
    }

    public static final class xq implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8594n;
        private final boolean rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof xq)) {
                return false;
            }
            xq xqVar = (xq) obj;
            return Intrinsics.areEqual(this.f8594n, xqVar.f8594n) && this.rl == xqVar.rl;
        }

        public xq(String hook, boolean z2) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            this.f8594n = hook;
            this.rl = z2;
        }

        public int hashCode() {
            return (this.f8594n.hashCode() * 31) + Boolean.hashCode(this.rl);
        }

        public final String n() {
            return this.f8594n;
        }

        public final boolean rl() {
            return this.rl;
        }

        public String toString() {
            return "PopupDismissed(hook=" + this.f8594n + ", withAndroidBackButton=" + this.rl + ")";
        }
    }

    public static final class xuv implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final xuv f8595n = new xuv();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof xuv);
        }

        public String toString() {
            return "HomeCreateProjectPlusButtonTapped";
        }

        private xuv() {
        }

        public int hashCode() {
            return 1286160662;
        }
    }

    public static final class ya implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8596n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SceneType f8597t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ya)) {
                return false;
            }
            ya yaVar = (ya) obj;
            return Intrinsics.areEqual(this.f8596n, yaVar.f8596n) && Intrinsics.areEqual(this.rl, yaVar.rl) && this.f8597t == yaVar.f8597t;
        }

        public ya(String projectId, String projectPackageId, SceneType projectType) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectType, "projectType");
            this.f8596n = projectId;
            this.rl = projectPackageId;
            this.f8597t = projectType;
        }

        public int hashCode() {
            return (((this.f8596n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8597t.hashCode();
        }

        public String toString() {
            return "ProjectPackageImported(projectId=" + this.f8596n + ", projectPackageId=" + this.rl + ", projectType=" + this.f8597t + ")";
        }
    }

    public static final class yg implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8598n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yg) && Intrinsics.areEqual(this.f8598n, ((yg) obj).f8598n);
        }

        public int hashCode() {
            String str = this.f8598n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EffectsColorAndLightButtonTapped(projectId=" + this.f8598n + ")";
        }

        public yg(String str) {
            this.f8598n = str;
        }
    }

    public static final class yht implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8599n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f8600t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof yht)) {
                return false;
            }
            yht yhtVar = (yht) obj;
            return Intrinsics.areEqual(this.f8599n, yhtVar.f8599n) && Intrinsics.areEqual(this.rl, yhtVar.rl) && Intrinsics.areEqual(this.f8600t, yhtVar.f8600t);
        }

        public yht(String hook, String answerSelected, String str) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            Intrinsics.checkNotNullParameter(answerSelected, "answerSelected");
            this.f8599n = hook;
            this.rl = answerSelected;
            this.f8600t = str;
        }

        public int hashCode() {
            int iHashCode = ((this.f8599n.hashCode() * 31) + this.rl.hashCode()) * 31;
            String str = this.f8600t;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SurveyQuestionCompleted(hook=" + this.f8599n + ", answerSelected=" + this.rl + ", freeText=" + this.f8600t + ")";
        }
    }

    public static final class yr implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8601n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yr) && Intrinsics.areEqual(this.f8601n, ((yr) obj).f8601n);
        }

        public yr(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8601n = projectId;
        }

        public int hashCode() {
            return this.f8601n.hashCode();
        }

        public String toString() {
            return "PasteLayerTapped(projectId=" + this.f8601n + ")";
        }
    }

    public static final class ys8 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f8602n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ys8) && Intrinsics.areEqual(this.f8602n, ((ys8) obj).f8602n);
        }

        public ys8(List presetIds) {
            Intrinsics.checkNotNullParameter(presetIds, "presetIds");
            this.f8602n = presetIds;
        }

        public int hashCode() {
            return this.f8602n.hashCode();
        }

        public String toString() {
            return "PresetExportButtonTapped(presetIds=" + this.f8602n + ")";
        }
    }

    /* JADX INFO: renamed from: QmE.j$z, reason: case insensitive filesystem */
    public static final class C1448z implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1448z f8603n = new C1448z();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1448z);
        }

        public String toString() {
            return "CloudUploadCancelled";
        }

        private C1448z() {
        }

        public int hashCode() {
            return 121365339;
        }
    }

    public static final class z3w implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8604n;
        private final List rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z3w)) {
                return false;
            }
            z3w z3wVar = (z3w) obj;
            return Intrinsics.areEqual(this.f8604n, z3wVar.f8604n) && Intrinsics.areEqual(this.rl, z3wVar.rl);
        }

        public z3w(String projectId, List layersType) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(layersType, "layersType");
            this.f8604n = projectId;
            this.rl = layersType;
        }

        public int hashCode() {
            return (this.f8604n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "MultiLayerSelected(projectId=" + this.f8604n + ", layersType=" + this.rl + ")";
        }
    }

    public static final class zO implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8605n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zO) && Intrinsics.areEqual(this.f8605n, ((zO) obj).f8605n);
        }

        public zO(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f8605n = projectId;
        }

        public int hashCode() {
            return this.f8605n.hashCode();
        }

        public String toString() {
            return "UndoButtonTapped(projectId=" + this.f8605n + ")";
        }
    }

    public static final class zpl implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final zpl f8606n = new zpl();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zpl);
        }

        public String toString() {
            return "PlayfulUnlockFtGameStarted";
        }

        private zpl() {
        }

        public int hashCode() {
            return -27777260;
        }
    }

    public static final class I28 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f8402n = new I28();

        private I28() {
        }
    }

    /* JADX INFO: renamed from: QmE.j$u, reason: case insensitive filesystem */
    public static final class C1447u implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f8587n;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f8588t;

        public C1447u(boolean z2, boolean z3, boolean z4) {
            this.f8587n = z2;
            this.rl = z3;
            this.f8588t = z4;
        }
    }
}
