package IvA;

import D3C.AbstractC1320c;
import D5a.gnv;
import Dj9.j;
import Dk.InterfaceC1335n;
import Fl.AbstractC1356c;
import GW.r;
import KC.Q;
import KC.U;
import KC.W;
import KC.ci;
import KC.eZk;
import KC.rfW;
import KC.t6;
import KC.tmw;
import KC.tpM;
import Ko8.QJ;
import Ko8.UGc;
import M.M;
import M.OA;
import M.Ogx;
import M.Qik;
import M.RGN;
import M.S;
import M.Sis;
import M.T;
import M.VoU;
import M.kO4;
import M.m8h;
import M.qf;
import M.s6u;
import M.xTb;
import M.xuv;
import M.yr;
import Pjo.QJ;
import Si.C1469c;
import UO6.rv6;
import Y.AbstractC1494z;
import Y.B;
import Y.LEl;
import Y.Mf;
import Y.g9s;
import Y.qYU;
import Y.vd;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.SavedStateHandle;
import ao.C1647j;
import cg.o;
import com.alightcreative.account.IAPBackend;
import com.alightcreative.account.IAPMiddleware;
import com.alightcreative.app.motion.AlightMotionApplication;
import com.alightcreative.app.motion.activities.AboutActivity;
import com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity;
import com.alightcreative.app.motion.activities.ColorPickerActivity;
import com.alightcreative.app.motion.activities.DevSettingsActivity;
import com.alightcreative.app.motion.activities.DeviceMismatchNoticeActivity;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.FontBrowserActivity;
import com.alightcreative.app.motion.activities.Hag;
import com.alightcreative.app.motion.activities.ManageAccountActivity;
import com.alightcreative.app.motion.activities.MyAccountActivity;
import com.alightcreative.app.motion.activities.Pf;
import com.alightcreative.app.motion.activities.QaP;
import com.alightcreative.app.motion.activities.SaveToStorageActivity;
import com.alightcreative.app.motion.activities.SettingsActivity;
import com.alightcreative.app.motion.activities.TP;
import com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity;
import com.alightcreative.app.motion.activities.creatorprogram.qas.ui.CN3;
import com.alightcreative.app.motion.activities.creatorprogram.qas.ui.QAsActivity;
import com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity;
import com.alightcreative.app.motion.activities.creatorprogram.redeem.aC;
import com.alightcreative.app.motion.activities.creatorprogram.rewardlist.CreatorRewardListActivity;
import com.alightcreative.app.motion.activities.crp;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.alightcreative.app.motion.activities.effectbrowser.EffectBrowserActivity;
import com.alightcreative.app.motion.activities.fic;
import com.alightcreative.app.motion.activities.main.MainActivity;
import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity;
import com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser;
import com.alightcreative.app.motion.activities.survey.I28;
import com.alightcreative.app.motion.activities.survey.SurveyActivity;
import com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileActivity;
import com.alightcreative.app.motion.tutorial.TutorialActivity;
import com.alightcreative.backup.domain.usecases.internal.C1757c;
import com.alightcreative.backup.domain.usecases.internal.z;
import com.alightcreative.export.preview.ExportPreviewActivity;
import com.alightcreative.importer.projectpackage.ElementDownloadActivity;
import com.alightcreative.importer.xml.data.XmlValidationBackend;
import com.alightcreative.importer.xml.ui.ImportActivity;
import com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity;
import com.alightcreative.maineditor.presetpreview.ui.fuX;
import com.alightcreative.monetization.stackedintro.C;
import com.alightcreative.monetization.stackedintro.StackedOffersPaywallActivity;
import com.alightcreative.monetization.ui.I28;
import com.alightcreative.monetization.ui.PaywallActivity;
import com.alightcreative.monorepo.settings.StackedIntroOffersEntity;
import com.alightcreative.onboarding.ui.OnboardingActivity;
import com.alightcreative.room.AlightDatabase;
import com.alightcreative.template.importpreview.ui.Dsr;
import com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity;
import f.EnumC1982eO;
import f0P.AbstractC1998Lj;
import f0P.C2065oU;
import f0P.C2099zf;
import f0P.CR;
import f0P.Dqm;
import f0P.J2L;
import f0P.Jr;
import f0P.Ny;
import f0P.P;
import f0P.T9;
import f0P.Wqz;
import f0P.ZJ;
import f0P.bQd;
import f0P.cQd;
import f0P.gn;
import f0P.hMB;
import f0P.iF;
import f0P.iP;
import f0P.mAi;
import f0P.nW;
import f0P.oC;
import f0P.tC;
import f0P.w8;
import f0P.xS;
import i.C2165Ml;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.InterfaceC2202n;
import kP.InterfaceC2210n;
import m.AbstractC2274Dsr;
import okhttp3.OkHttpClient;
import qHw.h;
import td9.C2378z;
import td9.Zs;
import td9.psW;
import w.InterfaceC2413n;
import xAo.Lu;
import xhQ.AbstractC2426c;
import yU.afx;
import zIC.AbstractC2493c;
import zIC.AbstractC2494z;
import zIC.DAz;
import zIC.Ew;
import zIC.Ln;
import zIC.SPz;
import zIC.Z;
import zIC.iwV;
import zIC.l3D;
import zIC.lej;
import zIC.nKK;
import zIC.r;
import zIC.s4;
import zIC.u;
import zRY.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class qz {

    private static final class C implements Xsz.I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4323n;
        private OM5.w6 nr;
        private final Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private SavedStateHandle f4324t;

        private C(fuX fux, Ml ml) {
            this.f4323n = fux;
            this.rl = ml;
        }

        @Override // Xsz.I28
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public IvA.Dsr build() {
            D23.w6.n(this.f4324t, SavedStateHandle.class);
            D23.w6.n(this.nr, OM5.w6.class);
            return new o(this.f4323n, this.rl, this.f4324t, this.nr);
        }

        @Override // Xsz.I28
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public C n(OM5.w6 w6Var) {
            this.nr = (OM5.w6) D23.w6.rl(w6Var);
            return this;
        }

        @Override // Xsz.I28
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public C rl(SavedStateHandle savedStateHandle) {
            this.f4324t = (SavedStateHandle) D23.w6.rl(savedStateHandle);
            return this;
        }
    }

    private static final class CN3 extends IvA.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4325n;
        private final CN3 nr = this;
        private final Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n f4326t;

        @Override // Fl.Xo
        public void Ik(Fl.Wre wre) {
        }

        @Override // GW.C
        public void XQ(GW.fuX fux) {
        }

        @Override // i6.I28
        public void az(i6.Ml ml) {
        }

        @Override // com.alightcreative.app.motion.activities.InterfaceC1740x
        public void ck(EditActivity.Ml ml) {
        }

        @Override // xhQ.eO
        public void e(xhQ.Xo xo) {
        }

        @Override // jEU.w6
        public void g(jEU.n nVar) {
        }

        @Override // M.RzR
        public void iF(Sis sis) {
        }

        @Override // Pjo.fuX
        public void mUb(Pjo.Wre wre) {
        }

        private qf B(qf qfVar) {
            M.t(qfVar, this.f4325n.r());
            M.J2(qfVar, (kgE.fuX) this.f4325n.aYN.get());
            M.rl(qfVar, (xAo.I28) this.rl.nr.get());
            M.n(qfVar, (InterfaceC1335n) this.f4325n.KN.get());
            M.O(qfVar, (InterfaceC2413n) this.f4325n.eF.get());
            M.nr(qfVar, (nYs.Ml) this.f4325n.f4352S.get());
            M.Uo(qfVar, (InterfaceC2210n) this.f4325n.rV9.get());
            return qfVar;
        }

        private S D(S s2) {
            Qik.rl(s2, (eQ.fuX) this.f4325n.Xw.get());
            Qik.n(s2, this.f4325n.r());
            return s2;
        }

        private UO6.qf E(UO6.qf qfVar) {
            rv6.rl(qfVar, this.f4325n.r());
            rv6.nr(qfVar, (kgE.fuX) this.f4325n.aYN.get());
            rv6.t(qfVar, (nYs.Ml) this.f4325n.f4352S.get());
            rv6.n(qfVar, (xAo.I28) this.rl.nr.get());
            return qfVar;
        }

        private C2065oU FX(C2065oU c2065oU) {
            xS.rl(c2065oU, this.f4325n.r());
            xS.n(c2065oU, (xAo.I28) this.rl.nr.get());
            hMB.n(c2065oU, (kgE.fuX) this.f4325n.aYN.get());
            return c2065oU;
        }

        private iP GR(iP iPVar) {
            cQd.rl(iPVar, (kgE.fuX) this.f4325n.aYN.get());
            cQd.n(iPVar, this.f4325n.r());
            return iPVar;
        }

        private oC I(oC oCVar) {
            xS.rl(oCVar, this.f4325n.r());
            xS.n(oCVar, (xAo.I28) this.rl.nr.get());
            Dqm.n(oCVar, (kgE.fuX) this.f4325n.aYN.get());
            return oCVar;
        }

        private Ogx J(Ogx ogx) {
            T.n(ogx, this.f4325n.r());
            return ogx;
        }

        private D3C.Ml M(D3C.Ml ml) {
            D3C.CN3.n(ml, (eQ.fuX) this.f4325n.Xw.get());
            return ml;
        }

        private ZJ M7(ZJ zj) {
            xS.rl(zj, this.f4325n.r());
            xS.n(zj, (xAo.I28) this.rl.nr.get());
            bQd.t(zj, (kgE.fuX) this.f4325n.aYN.get());
            bQd.n(zj, (Q.fuX) this.rl.f4330O.get());
            bQd.rl(zj, (nYs.Ml) this.f4325n.f4352S.get());
            bQd.nr(zj, (InterfaceC2210n) this.f4325n.rV9.get());
            return zj;
        }

        private C2099zf Nxk(C2099zf c2099zf) {
            T9.n(c2099zf, (kgE.fuX) this.f4325n.aYN.get());
            return c2099zf;
        }

        private LEl P5(LEl lEl) {
            Mf.t(lEl, (kgE.fuX) this.f4325n.aYN.get());
            Mf.rl(lEl, (Q.fuX) this.rl.f4330O.get());
            Mf.n(lEl, this.f4325n.r());
            return lEl;
        }

        private Y.M U(Y.M m2) {
            vd.n(m2, this.f4325n.r());
            vd.rl(m2, (kgE.fuX) this.f4325n.aYN.get());
            return m2;
        }

        private Wqz Xw(Wqz wqz) {
            AbstractC1998Lj.t(wqz, (kgE.fuX) this.f4325n.aYN.get());
            AbstractC1998Lj.rl(wqz, this.f4325n.r());
            AbstractC1998Lj.n(wqz, (xAo.I28) this.rl.nr.get());
            return wqz;
        }

        private Ny Y(Ny ny) {
            xS.rl(ny, this.f4325n.r());
            xS.n(ny, (xAo.I28) this.rl.nr.get());
            return ny;
        }

        private xTb a(xTb xtb) {
            m8h.rl(xtb, this.f4325n.r());
            m8h.nr(xtb, (kgE.fuX) this.f4325n.aYN.get());
            m8h.n(xtb, (xAo.I28) this.rl.nr.get());
            m8h.t(xtb, (nYs.Ml) this.f4325n.f4352S.get());
            m8h.O(xtb, (InterfaceC2210n) this.f4325n.rV9.get());
            return xtb;
        }

        private J2L bzg(J2L j2l) {
            Jr.rl(j2l, (kgE.fuX) this.f4325n.aYN.get());
            Jr.n(j2l, this.f4325n.r());
            return j2l;
        }

        private f52.I28 dR0(f52.I28 i28) {
            f52.CN3.n(i28, (eQ.fuX) this.f4325n.Xw.get());
            return i28;
        }

        private tC eF(tC tCVar) {
            w8.n(tCVar, this.f4325n.r());
            w8.rl(tCVar, (nYs.Ml) this.f4325n.f4352S.get());
            w8.t(tCVar, (WK.I28) this.f4325n.nY.get());
            return tCVar;
        }

        private com.alightcreative.app.motion.activities.effectbrowser.j jB(com.alightcreative.app.motion.activities.effectbrowser.j jVar) {
            g9s.t(jVar, (kgE.fuX) this.f4325n.aYN.get());
            g9s.rl(jVar, (Q.fuX) this.rl.f4330O.get());
            g9s.n(jVar, this.f4325n.r());
            return jVar;
        }

        private qYU k(qYU qyu) {
            B.rl(qyu, (kgE.fuX) this.f4325n.aYN.get());
            B.n(qyu, (Q.fuX) this.rl.f4330O.get());
            return qyu;
        }

        private gn p5(gn gnVar) {
            nW.O(gnVar, (kgE.fuX) this.f4325n.aYN.get());
            nW.t(gnVar, (Q.fuX) this.rl.f4330O.get());
            nW.rl(gnVar, this.f4325n.r());
            nW.n(gnVar, (xAo.I28) this.rl.nr.get());
            nW.nr(gnVar, (nYs.Ml) this.f4325n.f4352S.get());
            return gnVar;
        }

        private qHw.vd rV9(qHw.vd vdVar) {
            h.n(vdVar, this.f4325n.r());
            h.rl(vdVar, (kgE.fuX) this.f4325n.aYN.get());
            return vdVar;
        }

        private jEU.Dsr s7N(jEU.Dsr dsr) {
            jEU.o.n(dsr, (nYs.Ml) this.f4325n.f4352S.get());
            return dsr;
        }

        private Q v(Q q2) {
            ci.rl(q2, this.f4325n.r());
            ci.nr(q2, (kgE.fuX) this.f4325n.aYN.get());
            ci.n(q2, (xAo.I28) this.rl.nr.get());
            ci.t(q2, (nYs.Ml) this.f4325n.f4352S.get());
            ci.O(q2, (InterfaceC2210n) this.f4325n.rV9.get());
            return q2;
        }

        private P wTp(P p2) {
            iF.O(p2, (kgE.fuX) this.f4325n.aYN.get());
            iF.t(p2, (Q.fuX) this.rl.f4330O.get());
            iF.rl(p2, this.f4325n.r());
            iF.n(p2, (xAo.I28) this.rl.nr.get());
            iF.nr(p2, (nYs.Ml) this.f4325n.f4352S.get());
            return p2;
        }

        private mAi z(mAi mai) {
            CR.n(mai, this.f4325n.r());
            return mai;
        }

        @Override // Dj9.j.n
        public j.w6 n() {
            return this.f4326t.n();
        }

        @Override // BGJ.fuX.w6
        public Xsz.Wre ty() {
            return new C0148qz(this.f4325n, this.rl, this.f4326t, this.nr);
        }

        CN3(fuX fux, Ml ml, n nVar, Fragment fragment) {
            this.f4325n = fux;
            this.rl = ml;
            this.f4326t = nVar;
        }

        @Override // Y.KH
        public void E2(LEl lEl) {
            P5(lEl);
        }

        @Override // jEU.C
        public void HI(jEU.Dsr dsr) {
            s7N(dsr);
        }

        @Override // f0P.fc
        public void J2(gn gnVar) {
            p5(gnVar);
        }

        @Override // f0P.Yn
        public void KN(mAi mai) {
            z(mai);
        }

        @Override // f0P.xM
        public void N(C2065oU c2065oU) {
            FX(c2065oU);
        }

        @Override // UO6.M
        public void O(UO6.qf qfVar) {
            E(qfVar);
        }

        @Override // D3C.Wre
        public void S(D3C.Ml ml) {
            M(ml);
        }

        @Override // f0P.R8
        public void T(C2099zf c2099zf) {
            Nxk(c2099zf);
        }

        @Override // Y.rv6
        public void Uo(Y.M m2) {
            U(m2);
        }

        @Override // f0P.OQ5
        public void ViF(iP iPVar) {
            GR(iPVar);
        }

        @Override // f52.Wre
        public void WPU(f52.I28 i28) {
            dR0(i28);
        }

        @Override // qHw.Lu
        public void X(qHw.vd vdVar) {
            rV9(vdVar);
        }

        @Override // f0P.tUY
        public void Z(J2L j2l) {
            bzg(j2l);
        }

        @Override // M.DC
        public void aYN(Ogx ogx) {
            J(ogx);
        }

        @Override // f0P.GFb
        public void fD(ZJ zj) {
            M7(zj);
        }

        @Override // f0P.zU
        public void gh(Wqz wqz) {
            Xw(wqz);
        }

        @Override // Y.ci
        public void nHg(com.alightcreative.app.motion.activities.effectbrowser.j jVar) {
            jB(jVar);
        }

        @Override // KC.SPz
        public void nY(Q q2) {
            v(q2);
        }

        @Override // M.iwV
        public void nr(qf qfVar) {
            B(qfVar);
        }

        @Override // M.V
        public void o(S s2) {
            D(s2);
        }

        @Override // f0P.eF
        public void qie(Ny ny) {
            Y(ny);
        }

        @Override // Y.RGN
        public void r(qYU qyu) {
            k(qyu);
        }

        @Override // f0P.hzB
        public void rl(tC tCVar) {
            eF(tCVar);
        }

        @Override // f0P.InterfaceC2055m
        public void t(P p2) {
            wTp(p2);
        }

        @Override // f0P.H5j
        public void te(oC oCVar) {
            I(oCVar);
        }

        @Override // M.rrk
        public void xMQ(xTb xtb) {
            a(xtb);
        }
    }

    private static final class Dsr implements Xsz.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4327n;
        private View nr;
        private final Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n f4328t;

        private Dsr(fuX fux, Ml ml, n nVar) {
            this.f4327n = fux;
            this.rl = ml;
            this.f4328t = nVar;
        }

        @Override // Xsz.Ml
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public IvA.fuX build() {
            D23.w6.n(this.nr, View.class);
            return new aC(this.f4327n, this.rl, this.f4328t, this.nr);
        }

        @Override // Xsz.Ml
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Dsr n(View view) {
            this.nr = (View) D23.w6.rl(view);
            return this;
        }
    }

    public static final class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private sMY.j f4329n;

        private I28() {
        }

        public IvA.CN3 rl() {
            D23.w6.n(this.f4329n, sMY.j.class);
            return new fuX(this.f4329n);
        }

        public I28 n(sMY.j jVar) {
            this.f4329n = (sMY.j) D23.w6.rl(jVar);
            return this;
        }
    }

    private static final class Ml extends IvA.I28 {
        D23.Ml J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        D23.Ml f4330O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4331n;
        D23.Ml nr;
        private final Ml rl = this;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        D23.Ml f4332t;

        private static final class j implements D23.Ml {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final fuX f4333n;
            private final Ml rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final int f4334t;

            @Override // qp.InterfaceC2342j
            public Object get() {
                int i2 = this.f4334t;
                if (i2 == 0) {
                    return BGJ.w6.n();
                }
                if (i2 == 1) {
                    return new Q.Pl(this.f4333n.eF(), (xAo.I28) this.rl.nr.get(), (nYs.Ml) this.f4333n.f4352S.get(), (InterfaceC2210n) this.f4333n.rV9.get(), (Q.w6) this.f4333n.bzg.get());
                }
                if (i2 == 2) {
                    return new xAo.I28((sqD.n) this.f4333n.az.get(), this.f4333n.r(), (kgE.fuX) this.f4333n.aYN.get(), this.f4333n.eF(), (nYs.Ml) this.f4333n.f4352S.get(), this.f4333n.iF(), (NuI.I28) this.f4333n.f4355X.get(), (NuI.CN3) this.f4333n.s7N.get(), this.rl.az(), this.f4333n.v());
                }
                if (i2 == 3) {
                    return new xAo.qf((nYs.Ml) this.f4333n.f4352S.get(), this.f4333n.eF(), (xAo.I28) this.rl.nr.get(), this.f4333n.iF(), (NuI.CN3) this.f4333n.s7N.get());
                }
                throw new AssertionError(this.f4334t);
            }

            j(fuX fux, Ml ml, int i2) {
                this.f4333n = fux;
                this.rl = ml;
                this.f4334t = i2;
            }
        }

        private void ck(BGJ.CN3 cn3) {
            this.f4332t = D23.j.t(new j(this.f4331n, this.rl, 0));
            this.nr = D23.j.t(new j(this.f4331n, this.rl, 2));
            this.f4330O = D23.j.t(new j(this.f4331n, this.rl, 1));
            this.J2 = D23.j.t(new j(this.f4331n, this.rl, 3));
        }

        r53.C HI() {
            return new r53.C(sMY.w6.n(this.f4331n.f4362n), this.f4331n.a(), Z(), gh(), XQ(), O(), this.f4331n.r());
        }

        WaZ.I28 Ik() {
            return new WaZ.I28((kgE.fuX) this.f4331n.aYN.get(), this.f4331n.r());
        }

        Ko8.I28 J2() {
            return new Ko8.I28(sMY.w6.n(this.f4331n.f4362n), this.f4331n.r());
        }

        Ko8.fuX KN() {
            return new Ko8.fuX(mUb(), this.f4331n.r());
        }

        r53.w6 O() {
            return new r53.w6(sMY.w6.n(this.f4331n.f4362n), this.f4331n.r());
        }

        uF.n Uo() {
            return new uF.n((nYs.Ml) this.f4331n.f4352S.get(), (InterfaceC1335n) this.f4331n.KN.get(), this.f4331n.r());
        }

        UGc XQ() {
            return new UGc(sMY.w6.n(this.f4331n.f4362n), new X.j(), this.f4331n.r());
        }

        r53.Xo Z() {
            return new r53.Xo((XmlValidationBackend) this.f4331n.Nxk.get(), this.f4331n.r());
        }

        WK.n az() {
            return new WK.n(sMY.w6.n(this.f4331n.f4362n), this.f4331n.r());
        }

        r53.CN3 gh() {
            return new r53.CN3(sMY.w6.n(this.f4331n.f4362n), new X.j(), this.f4331n.r());
        }

        Ko8.Pl mUb() {
            return new Ko8.Pl(r(), new X.j(), this.f4331n.r());
        }

        @Override // BGJ.j.InterfaceC0012j
        public Xsz.j n() {
            return new j(this.f4331n, this.rl);
        }

        WaZ.n nr() {
            return new WaZ.n(this.f4331n.M());
        }

        Je.CN3 o() {
            return new Je.CN3(sMY.w6.n(this.f4331n.f4362n), new X.j(), mUb(), XQ(), this.f4331n.r());
        }

        xhQ.I28 qie() {
            return new xhQ.I28(sMY.w6.n(this.f4331n.f4362n), (kgE.fuX) this.f4331n.aYN.get(), this.f4331n.eF());
        }

        QJ r() {
            return new QJ(sMY.w6.n(this.f4331n.f4362n), this.f4331n.r());
        }

        @Override // BGJ.n.Ml
        public OM5.j rl() {
            return (OM5.j) this.f4332t.get();
        }

        Je.Ml t() {
            return new Je.Ml((kgE.fuX) this.f4331n.aYN.get());
        }

        fVJ.Ml ty() {
            return new fVJ.Ml((kgE.fuX) this.f4331n.aYN.get(), (nYs.Ml) this.f4331n.f4352S.get(), this.f4331n.eF());
        }

        Ko8.C xMQ() {
            return new Ko8.C(this.f4331n.r());
        }

        Ml(fuX fux, BGJ.CN3 cn3) {
            this.f4331n = fux;
            ck(cn3);
        }
    }

    private static final class Wre implements Xsz.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4338n;
        private Fragment nr;
        private final Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n f4339t;

        private Wre(fuX fux, Ml ml, n nVar) {
            this.f4338n = fux;
            this.rl = ml;
            this.f4339t = nVar;
        }

        @Override // Xsz.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public IvA.Wre build() {
            D23.w6.n(this.nr, Fragment.class);
            return new CN3(this.f4338n, this.rl, this.f4339t, this.nr);
        }

        @Override // Xsz.w6
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Wre n(Fragment fragment) {
            this.nr = (Fragment) D23.w6.rl(fragment);
            return this;
        }
    }

    private static final class aC extends IvA.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4340n;
        private final aC nr = this;
        private final Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n f4341t;

        @Override // Si.s4
        public void rl(C1469c c1469c) {
        }

        private ColorPickerWidget t(ColorPickerWidget colorPickerWidget) {
            afx.n(colorPickerWidget, this.f4340n.r());
            return colorPickerWidget;
        }

        aC(fuX fux, Ml ml, n nVar, View view) {
            this.f4340n = fux;
            this.rl = ml;
            this.f4341t = nVar;
        }

        @Override // yU.g9s
        public void n(ColorPickerWidget colorPickerWidget) {
            t(colorPickerWidget);
        }
    }

    private static final class fuX extends IvA.CN3 {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        D23.Ml f4342B;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        D23.Ml f4343D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        D23.Ml f4344E;
        D23.Ml E2;

        /* JADX INFO: renamed from: FX, reason: collision with root package name */
        D23.Ml f4345FX;

        /* JADX INFO: renamed from: GR, reason: collision with root package name */
        D23.Ml f4346GR;
        D23.Ml HI;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        D23.Ml f4347I;
        D23.Ml Ik;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        D23.Ml f4348J;
        D23.Ml J2;
        D23.Ml KN;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        D23.Ml f4349M;
        D23.Ml M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        D23.Ml f4350N;
        D23.Ml Nxk;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        D23.Ml f4351O;
        D23.Ml P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        D23.Ml f4352S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        D23.Ml f4353T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        D23.Ml f4354U;
        D23.Ml Uo;
        D23.Ml ViF;
        D23.Ml WPU;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        D23.Ml f4355X;
        D23.Ml XQ;
        D23.Ml Xw;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        D23.Ml f4356Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        D23.Ml f4357Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        D23.Ml f4358a;
        D23.Ml aYN;
        D23.Ml az;
        D23.Ml bzg;
        D23.Ml ck;
        D23.Ml dR0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        D23.Ml f4359e;
        D23.Ml eF;
        D23.Ml fD;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        D23.Ml f4360g;
        D23.Ml gh;
        D23.Ml iF;
        D23.Ml ijL;
        D23.Ml jB;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        D23.Ml f4361k;
        D23.Ml mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final sMY.j f4362n;
        D23.Ml nHg;
        D23.Ml nY;
        D23.Ml nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        D23.Ml f4363o;
        D23.Ml p5;
        D23.Ml piY;
        D23.Ml qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        D23.Ml f4364r;
        D23.Ml rV9;
        private final fuX rl = this;
        D23.Ml s7N;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        D23.Ml f4365t;
        D23.Ml te;
        D23.Ml ty;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        D23.Ml f4366v;
        D23.Ml wTp;
        D23.Ml xMQ;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        D23.Ml f4367z;

        private static final class j implements D23.Ml {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final fuX f4368n;
            private final int rl;

            @Override // qp.InterfaceC2342j
            public Object get() {
                switch (this.rl) {
                    case 0:
                        return new com.alightcreative.account.n((IAPMiddleware) this.f4368n.nr.get(), (sqD.n) this.f4368n.az.get(), (YV.Wre) this.f4368n.Ik.get(), (cd.g9s) this.f4368n.f4364r.get(), (rO.n) this.f4368n.f4363o.get(), this.f4368n.v(), (nYs.Ml) this.f4368n.f4352S.get(), this.f4368n.r());
                    case 1:
                        return new IAPMiddleware((IAPBackend) this.f4368n.f4365t.get());
                    case 2:
                        return new IAPBackend();
                    case 3:
                        return zk.w6.n(sMY.w6.n(this.f4368n.f4362n), new xAo.Ml(), (rB.Ml) this.f4368n.J2.get(), (CZF.I28) this.f4368n.qie.get());
                    case 4:
                        return zIC.M.n(sMY.w6.n(this.f4368n.f4362n), (OkHttpClient) this.f4368n.f4351O.get());
                    case 5:
                        return zIC.afx.n();
                    case 6:
                        return DAz.n(sMY.w6.n(this.f4368n.f4362n), (OkHttpClient) this.f4368n.f4351O.get(), (rB.Ml) this.f4368n.J2.get(), (InterfaceC1335n) this.f4368n.KN.get(), (Fyf.w6) this.f4368n.xMQ.get(), (qu.I28) this.f4368n.gh.get());
                    case 7:
                        return zIC.QJ.n(sMY.w6.n(this.f4368n.f4362n), (bH.CN3) this.f4368n.Uo.get(), (rB.Ml) this.f4368n.J2.get());
                    case 8:
                        return iwV.n(sMY.w6.n(this.f4368n.f4362n), (rB.Ml) this.f4368n.J2.get());
                    case 9:
                        return zIC.UGc.n(sMY.w6.n(this.f4368n.f4362n), (InterfaceC1335n) this.f4368n.KN.get());
                    case 10:
                        return Ew.n(sMY.w6.n(this.f4368n.f4362n), (bH.CN3) this.f4368n.Uo.get(), (rB.Ml) this.f4368n.J2.get(), (qu.Dsr) this.f4368n.mUb.get());
                    case 11:
                        return nKK.n(sMY.w6.n(this.f4368n.f4362n), (OkHttpClient) this.f4368n.f4351O.get(), (rB.Ml) this.f4368n.J2.get(), (InterfaceC1335n) this.f4368n.KN.get(), (Fyf.w6) this.f4368n.xMQ.get());
                    case 12:
                        return zIC.g9s.n(sMY.w6.n(this.f4368n.f4362n), (qu.I28) this.f4368n.gh.get(), (qu.Dsr) this.f4368n.mUb.get(), (cKn.Wre) this.f4368n.ck.get(), (CZF.I28) this.f4368n.qie.get(), (bH.CN3) this.f4368n.Uo.get(), (rB.Ml) this.f4368n.J2.get());
                    case 13:
                        return zIC.rv6.n(sMY.w6.n(this.f4368n.f4362n), (InterfaceC1335n) this.f4368n.KN.get(), (rB.Ml) this.f4368n.J2.get(), (CZF.I28) this.f4368n.qie.get(), (K0.n) this.f4368n.HI.get(), (bH.CN3) this.f4368n.Uo.get());
                    case 14:
                        return SPz.n(sMY.w6.n(this.f4368n.f4362n), (bH.CN3) this.f4368n.Uo.get(), (rB.Ml) this.f4368n.J2.get(), (qu.Dsr) this.f4368n.mUb.get(), (qu.I28) this.f4368n.gh.get(), (CZF.I28) this.f4368n.qie.get(), (nKt.n) this.f4368n.ty.get());
                    case 15:
                        return u.n(sMY.w6.n(this.f4368n.f4362n), (InterfaceC1335n) this.f4368n.KN.get());
                    case 16:
                        return new cd.g9s((YV.Wre) this.f4368n.Ik.get(), this.f4368n.r());
                    case 17:
                        return new rO.n((InterfaceC1335n) this.f4368n.KN.get(), this.f4368n.r());
                    case 18:
                        return new nYs.I28((U5u.j) this.f4368n.f4357Z.get());
                    case 19:
                        return Z.n((qu.I28) this.f4368n.gh.get(), (rB.Ml) this.f4368n.J2.get());
                    case 20:
                        return new cg.qz(sMY.w6.n(this.f4368n.f4362n));
                    case 21:
                        return new WK.I28();
                    case 22:
                        return fgG.n.n(sMY.w6.n(this.f4368n.f4362n));
                    case 23:
                        fuX fux = this.f4368n;
                        return new NuI.Wre(fux.iF, fux.E2, (nYs.Ml) fux.f4352S.get());
                    case 24:
                        return zIC.Q.n(sMY.w6.n(this.f4368n.f4362n), (InterfaceC2202n) this.f4368n.te.get(), (CZF.I28) this.f4368n.qie.get(), (nKt.n) this.f4368n.ty.get(), (rB.Ml) this.f4368n.J2.get());
                    case 25:
                        return zIC.Xo.n(sMY.w6.n(this.f4368n.f4362n), (K0.n) this.f4368n.HI.get(), (bH.CN3) this.f4368n.Uo.get(), (rB.Ml) this.f4368n.J2.get());
                    case 26:
                        return r.n(sMY.w6.n(this.f4368n.f4362n), (InterfaceC2202n) this.f4368n.fD.get(), (CZF.I28) this.f4368n.qie.get(), (nKt.n) this.f4368n.ty.get(), (rB.Ml) this.f4368n.J2.get());
                    case 27:
                        return zIC.ci.n(sMY.w6.n(this.f4368n.f4362n), (K0.n) this.f4368n.HI.get(), (bH.CN3) this.f4368n.Uo.get(), (rB.Ml) this.f4368n.J2.get());
                    case 28:
                        fuX fux2 = this.f4368n;
                        return new NuI.fuX(fux2.f4353T, fux2.f4350N, (nYs.Ml) fux2.f4352S.get());
                    case 29:
                        return Ln.n(sMY.w6.n(this.f4368n.f4362n), (InterfaceC2202n) this.f4368n.te.get(), (CZF.I28) this.f4368n.qie.get(), (nKt.n) this.f4368n.ty.get(), (rB.Ml) this.f4368n.J2.get());
                    case 30:
                        return lej.n(sMY.w6.n(this.f4368n.f4362n), (InterfaceC2202n) this.f4368n.fD.get(), (CZF.I28) this.f4368n.qie.get(), (nKt.n) this.f4368n.ty.get(), (rB.Ml) this.f4368n.J2.get());
                    case 31:
                        return s4.n(sMY.n.n(this.f4368n.f4362n), (bH.CN3) this.f4368n.Uo.get(), (rB.Ml) this.f4368n.J2.get(), (OkHttpClient) this.f4368n.f4351O.get(), (qu.I28) this.f4368n.gh.get(), (CZF.I28) this.f4368n.qie.get(), (nYs.Ml) this.f4368n.f4352S.get(), (Eu.w6) this.f4368n.wTp.get(), (Eu.Ml) this.f4368n.f4366v.get());
                    case 32:
                        return zIC.eO.n(sMY.n.n(this.f4368n.f4362n), (NuI.CN3) this.f4368n.s7N.get(), (NuI.I28) this.f4368n.f4355X.get(), this.f4368n.iF());
                    case 33:
                        return AbstractC2494z.n(sMY.n.n(this.f4368n.f4362n), (YV.Wre) this.f4368n.Ik.get(), (qu.I28) this.f4368n.gh.get(), (rB.Ml) this.f4368n.J2.get(), (kgE.fuX) this.f4368n.aYN.get());
                    case 34:
                        return zIC.qf.n((InterfaceC2210n) this.f4368n.rV9.get(), this.f4368n.eF(), this.f4368n.X());
                    case 35:
                        return R.Ml.n(sMY.w6.n(this.f4368n.f4362n));
                    case 36:
                        return new cg.Dsr(sMY.w6.n(this.f4368n.f4362n));
                    case 37:
                        return new LD.w6((bH.CN3) this.f4368n.Uo.get(), (kgE.fuX) this.f4368n.aYN.get());
                    case 38:
                        return new w.w6((FZ.n) this.f4368n.M7.get(), (K0.n) this.f4368n.HI.get());
                    case 39:
                        return l3D.n(sMY.w6.n(this.f4368n.f4362n), (bH.CN3) this.f4368n.Uo.get(), (InterfaceC1335n) this.f4368n.KN.get(), (rB.Ml) this.f4368n.J2.get(), (qu.I28) this.f4368n.gh.get());
                    case 40:
                        return AbstractC2493c.n(sMY.w6.n(this.f4368n.f4362n), (qu.I28) this.f4368n.gh.get());
                    case 41:
                        return new glP.I28((nYs.Ml) this.f4368n.f4352S.get(), this.f4368n.r());
                    case 42:
                        return new Asx.w6(this.f4368n.B(), this.f4368n.r());
                    case 43:
                        return new NuI.aC(this.f4368n.te());
                    case 44:
                        return new com.alightcreative.backup.domain.usecases.internal.l3D();
                    case 45:
                        return new v5Z.j(sMY.w6.n(this.f4368n.f4362n));
                    case 46:
                        return new XmlValidationBackend();
                    case 47:
                        return new glP.j((InterfaceC2413n) this.f4368n.eF.get());
                    case 48:
                        return new Zo7.j((InterfaceC2413n) this.f4368n.eF.get());
                    case 49:
                        return new Zo7.n();
                    default:
                        throw new AssertionError(this.rl);
                }
            }

            j(fuX fux, int i2) {
                this.f4368n = fux;
                this.rl = i2;
            }
        }

        private void N(sMY.j jVar) {
            this.f4365t = D23.j.t(new j(this.rl, 2));
            this.nr = D23.j.t(new j(this.rl, 1));
            this.f4351O = D23.j.t(new j(this.rl, 5));
            this.J2 = D23.j.t(new j(this.rl, 4));
            this.Uo = D23.j.t(new j(this.rl, 8));
            this.KN = D23.j.t(new j(this.rl, 7));
            this.xMQ = D23.j.t(new j(this.rl, 9));
            this.mUb = D23.j.t(new j(this.rl, 11));
            this.gh = D23.j.t(new j(this.rl, 10));
            this.qie = D23.j.t(new j(this.rl, 6));
            this.az = D23.j.t(new j(this.rl, 3));
            this.ty = D23.j.t(new j(this.rl, 15));
            this.HI = D23.j.t(new j(this.rl, 14));
            this.ck = D23.j.t(new j(this.rl, 13));
            this.Ik = D23.j.t(new j(this.rl, 12));
            this.f4364r = D23.j.t(new j(this.rl, 16));
            this.f4363o = D23.j.t(new j(this.rl, 17));
            this.f4357Z = D23.j.t(new j(this.rl, 19));
            j jVar2 = new j(this.rl, 18);
            this.XQ = jVar2;
            this.f4352S = D23.j.t(jVar2);
            j jVar3 = new j(this.rl, 0);
            this.WPU = jVar3;
            this.aYN = D23.j.t(jVar3);
            this.ViF = D23.j.t(new j(this.rl, 20));
            this.nY = D23.j.t(new j(this.rl, 21));
            this.f4360g = D23.j.t(new j(this.rl, 22));
        }

        private void nHg(sMY.j jVar) {
            this.te = D23.j.t(new j(this.rl, 25));
            this.iF = D23.j.t(new j(this.rl, 24));
            this.fD = D23.j.t(new j(this.rl, 27));
            this.E2 = D23.j.t(new j(this.rl, 26));
            j jVar2 = new j(this.rl, 23);
            this.f4359e = jVar2;
            this.f4355X = D23.j.t(jVar2);
            this.f4353T = D23.j.t(new j(this.rl, 29));
            this.f4350N = D23.j.t(new j(this.rl, 30));
            j jVar3 = new j(this.rl, 28);
            this.nHg = jVar3;
            this.s7N = D23.j.t(jVar3);
            this.wTp = D23.j.t(new j(this.rl, 32));
            this.f4366v = D23.j.t(new j(this.rl, 33));
            this.rV9 = D23.j.t(new j(this.rl, 31));
            this.bzg = D23.j.t(new j(this.rl, 34));
            this.Xw = D23.j.t(new j(this.rl, 35));
            this.jB = D23.j.t(new j(this.rl, 36));
            j jVar4 = new j(this.rl, 37);
            this.f4354U = jVar4;
            this.P5 = D23.j.t(jVar4);
            this.M7 = D23.j.t(new j(this.rl, 39));
            j jVar5 = new j(this.rl, 38);
            this.p5 = jVar5;
            this.eF = D23.j.t(jVar5);
            this.f4344E = D23.j.t(new j(this.rl, 40));
            j jVar6 = new j(this.rl, 41);
            this.f4349M = jVar6;
            this.f4345FX = D23.j.t(jVar6);
            this.f4342B = D23.j.t(new j(this.rl, 43));
        }

        private void s7N(sMY.j jVar) {
            j jVar2 = new j(this.rl, 42);
            this.f4348J = jVar2;
            this.f4343D = D23.j.t(jVar2);
            j jVar3 = new j(this.rl, 44);
            this.f4358a = jVar3;
            this.f4347I = D23.j.t(jVar3);
            this.f4346GR = D23.j.t(new j(this.rl, 45));
            this.Nxk = D23.j.t(new j(this.rl, 46));
            j jVar4 = new j(this.rl, 47);
            this.f4356Y = jVar4;
            this.f4361k = D23.j.t(jVar4);
            j jVar5 = new j(this.rl, 48);
            this.dR0 = jVar5;
            this.f4367z = D23.j.t(jVar5);
            j jVar6 = new j(this.rl, 49);
            this.piY = jVar6;
            this.ijL = D23.j.t(jVar6);
        }

        private AlightMotionApplication wTp(AlightMotionApplication alightMotionApplication) {
            IvA.C.n(alightMotionApplication, (kgE.fuX) this.aYN.get());
            IvA.C.rl(alightMotionApplication, xMQ());
            return alightMotionApplication;
        }

        psW D() {
            return new psW(sMY.w6.n(this.f4362n), r());
        }

        JK.n E() {
            return new JK.n(I(), (kgE.fuX) this.aYN.get());
        }

        C1757c E2() {
            return new C1757c((kgE.fuX) this.aYN.get());
        }

        Zs GR() {
            return new Zs(r());
        }

        com.alightcreative.backup.domain.usecases.internal.C HI() {
            return new com.alightcreative.backup.domain.usecases.internal.C(rV9(), r());
        }

        f2.j I() {
            return fgG.w6.n((AlightDatabase) this.f4360g.get());
        }

        td9.fuX Ik() {
            return new td9.fuX(sMY.w6.n(this.f4362n), (kgE.fuX) this.aYN.get(), r());
        }

        Cs3.j J() {
            return new Cs3.j((rB.Ml) this.J2.get());
        }

        td9.w6 KN() {
            return new td9.w6(sMY.w6.n(this.f4362n), r());
        }

        Lu M() {
            return new Lu((kgE.fuX) this.aYN.get());
        }

        jg.j M7() {
            return new jg.j(D23.j.rl(this.qie));
        }

        @Override // BGJ.n.InterfaceC0013n
        public Xsz.n O() {
            return new w6(this.rl);
        }

        td9.vd P5() {
            return new td9.vd(r(), sMY.w6.n(this.f4362n), (NuI.Dsr) this.f4342B.get(), (qu.I28) this.gh.get(), (rB.Ml) this.J2.get(), (CZF.I28) this.qie.get(), (nKt.n) this.ty.get(), (cKn.Wre) this.ck.get(), (nYs.Ml) this.f4352S.get(), (InterfaceC2413n) this.eF.get(), (InterfaceC2210n) this.rV9.get());
        }

        C2378z S() {
            return new C2378z(sMY.w6.n(this.f4362n), r());
        }

        com.alightcreative.backup.domain.usecases.internal.s4 T() {
            return new com.alightcreative.backup.domain.usecases.internal.s4((kgE.fuX) this.aYN.get(), fD());
        }

        td9.M U() {
            return new td9.M((kgE.fuX) this.aYN.get(), r());
        }

        wR.n Uo() {
            return new wR.n(sMY.w6.n(this.f4362n), (cKn.Wre) this.ck.get());
        }

        td9.Ew ViF() {
            return new td9.Ew(r());
        }

        td9.l3D WPU() {
            return new td9.l3D(sMY.w6.n(this.f4362n), r());
        }

        WK.n X() {
            return new WK.n(sMY.w6.n(this.f4362n), r());
        }

        td9.Pl XQ() {
            return new td9.Pl(sMY.w6.n(this.f4362n), r());
        }

        td9.o Z() {
            return new td9.o(sMY.w6.n(this.f4362n), (cg.qz) this.ViF.get(), r());
        }

        X.w6 a() {
            return new X.w6(sMY.w6.n(this.f4362n));
        }

        td9.SPz aYN() {
            return new td9.SPz(r());
        }

        gY.n az() {
            return new gY.n(sMY.w6.n(this.f4362n), r());
        }

        c8G.j bzg() {
            return new c8G.j(sMY.w6.n(this.f4362n), r());
        }

        com.alightcreative.backup.domain.usecases.internal.eO ck() {
            return new com.alightcreative.backup.domain.usecases.internal.eO(rV9(), T(), fD(), r());
        }

        NoE.n e() {
            return new NoE.n((nYs.Ml) this.f4352S.get(), r());
        }

        Q.eO eF() {
            return new Q.eO(E(), (kgE.fuX) this.aYN.get());
        }

        z fD() {
            return new z((kgE.fuX) this.aYN.get());
        }

        td9.Ln g() {
            return new td9.Ln(sMY.w6.n(this.f4362n), r());
        }

        com.alightcreative.backup.domain.usecases.internal.fuX gh() {
            return new com.alightcreative.backup.domain.usecases.internal.fuX(HI(), sMY.w6.n(this.f4362n));
        }

        NuI.Ml iF() {
            return new NuI.Ml((nYs.Ml) this.f4352S.get());
        }

        xAo.iwV jB() {
            return new xAo.iwV(sMY.w6.n(this.f4362n));
        }

        com.alightcreative.backup.domain.usecases.internal.Ml mUb() {
            return new com.alightcreative.backup.domain.usecases.internal.Ml((kgE.fuX) this.aYN.get(), rV9(), gh(), (wtO.Wre) this.f4347I.get(), T(), fD(), HI(), r());
        }

        @Override // rkP.j
        public K0.n n() {
            return (K0.n) this.HI.get();
        }

        td9.u nY() {
            return new td9.u(r());
        }

        @Override // rkP.j
        public CZF.I28 nr() {
            return (CZF.I28) this.qie.get();
        }

        td9.aC o() {
            return new td9.aC(sMY.w6.n(this.f4362n), r());
        }

        td9.Lu p5() {
            return new td9.Lu(sMY.w6.n(this.f4362n), r(), (nYs.Ml) this.f4352S.get(), te(), (K0.n) this.HI.get(), (CZF.I28) this.qie.get());
        }

        td9.Ml qie() {
            return new td9.Ml(sMY.w6.n(this.f4362n), r());
        }

        C1647j r() {
            return new C1647j(FX());
        }

        com.alightcreative.backup.domain.usecases.internal.UGc rV9() {
            return new com.alightcreative.backup.domain.usecases.internal.UGc((wtO.Wre) this.f4347I.get(), sMY.w6.n(this.f4362n));
        }

        NuI.n te() {
            return new NuI.n(this.te, this.fD, (nYs.Ml) this.f4352S.get());
        }

        td9.I28 ty() {
            return new td9.I28((sqD.n) this.az.get(), (nYs.Ml) this.f4352S.get(), jB(), M(), r(), Xw());
        }

        p7.j v() {
            return new p7.j((YV.Wre) this.Ik.get());
        }

        fuX(sMY.j jVar) {
            this.f4362n = jVar;
            N(jVar);
            nHg(jVar);
            s7N(jVar);
        }

        List B() {
            return gpz.w6.n(qie(), P5(), U(), ty(), p5());
        }

        Set FX() {
            return com.google.common.collect.Ln.S(Uo(), new wR.w6(), new pc7.j(), M7(), J());
        }

        List Xw() {
            return zk.n.n(bzg());
        }

        @Override // IvA.w6
        public void rl(AlightMotionApplication alightMotionApplication) {
            wTp(alightMotionApplication);
        }

        @Override // Z7.j.InterfaceC0444j
        public Set t() {
            return com.google.common.collect.Ln.Ik();
        }

        List xMQ() {
            return gpz.n.n(XQ(), KN(), WPU(), Ik(), o(), S(), aYN(), ViF(), nY(), g(), D(), GR(), Z());
        }
    }

    private static final class j implements Xsz.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4369n;
        private final Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Activity f4370t;

        private j(fuX fux, Ml ml) {
            this.f4369n = fux;
            this.rl = ml;
        }

        @Override // Xsz.j
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public IvA.Ml build() {
            D23.w6.n(this.f4370t, Activity.class);
            return new n(this.f4369n, this.rl, this.f4370t);
        }

        @Override // Xsz.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public j n(Activity activity) {
            this.f4370t = (Activity) D23.w6.rl(activity);
            return this;
        }
    }

    private static final class n extends IvA.Ml {
        D23.Ml J2;
        D23.Ml KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        D23.Ml f4371O;
        D23.Ml Uo;
        D23.Ml gh;
        D23.Ml mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4372n;
        D23.Ml nr;
        private final Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n f4373t = this;
        D23.Ml xMQ;

        private static final class j implements D23.Ml {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final fuX f4374n;
            private final int nr;
            private final Ml rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final n f4375t;

            class CN3 implements I28.n {
                @Override // com.alightcreative.monetization.ui.I28.n
                public com.alightcreative.monetization.ui.I28 n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, List list, Boolean bool, Boolean bool2, EnumC1982eO enumC1982eO, String str13) {
                    return new com.alightcreative.monetization.ui.I28(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, num, list, bool, bool2, enumC1982eO, str13, (YV.Wre) j.this.f4374n.Ik.get(), (kgE.fuX) j.this.f4374n.aYN.get(), j.this.rl.Ik(), (cd.g9s) j.this.f4374n.f4364r.get(), (nYs.Ml) j.this.f4374n.f4352S.get(), j.this.f4375t.s7N(), j.this.rl.nr(), new WaZ.j(), j.this.f4374n.r());
                }

                CN3() {
                }
            }

            class I28 implements fuX.n {
                I28() {
                }

                @Override // com.alightcreative.maineditor.presetpreview.ui.fuX.n
                public com.alightcreative.maineditor.presetpreview.ui.fuX n(List list, String str, List list2, Long l2, boolean z2) {
                    return new com.alightcreative.maineditor.presetpreview.ui.fuX(list, str, list2, l2, z2, j.this.f4374n.az(), j.this.rl.mUb(), j.this.rl.xMQ(), j.this.rl.KN(), j.this.rl.o(), j.this.rl.J2(), j.this.rl.t(), (kgE.fuX) j.this.f4374n.aYN.get(), j.this.f4374n.r());
                }
            }

            class Ml implements I28.n {
                Ml() {
                }

                @Override // com.alightcreative.app.motion.activities.survey.I28.n
                public com.alightcreative.app.motion.activities.survey.I28 n(Nh.Ml ml, C2165Ml c2165Ml, String str) {
                    return new com.alightcreative.app.motion.activities.survey.I28(ml, c2165Ml, str, j.this.f4374n.r());
                }
            }

            class Wre implements C.Ml {
                Wre() {
                }

                @Override // com.alightcreative.monetization.stackedintro.C.Ml
                public com.alightcreative.monetization.stackedintro.C n(StackedIntroOffersEntity stackedIntroOffersEntity) {
                    return new com.alightcreative.monetization.stackedintro.C((CZF.I28) j.this.f4374n.qie.get(), (YV.Wre) j.this.f4374n.Ik.get(), (kgE.fuX) j.this.f4374n.aYN.get(), stackedIntroOffersEntity);
                }
            }

            class fuX implements Dsr.n {
                fuX() {
                }

                @Override // com.alightcreative.template.importpreview.ui.Dsr.n
                public com.alightcreative.template.importpreview.ui.Dsr n(LM.Wre wre, String str, xr.j jVar) {
                    return new com.alightcreative.template.importpreview.ui.Dsr(wre, str, jVar, j.this.f4374n.az(), (WK.I28) j.this.f4374n.nY.get(), j.this.f4374n.r());
                }
            }

            /* JADX INFO: renamed from: IvA.qz$n$j$j, reason: collision with other inner class name */
            class C0145j implements g9s.n {
                C0145j() {
                }

                @Override // zRY.g9s.n
                public zRY.g9s n(List list) {
                    return new zRY.g9s(j.this.rl.Uo(), j.this.f4374n.r(), (eQ.fuX) j.this.f4374n.Xw.get(), list);
                }
            }

            /* JADX INFO: renamed from: IvA.qz$n$j$n, reason: collision with other inner class name */
            class C0146n implements CN3.n {
                C0146n() {
                }

                @Override // com.alightcreative.app.motion.activities.creatorprogram.qas.ui.CN3.n
                public com.alightcreative.app.motion.activities.creatorprogram.qas.ui.CN3 n(F2p.Ml ml) {
                    return new com.alightcreative.app.motion.activities.creatorprogram.qas.ui.CN3(ml, j.this.f4374n.e());
                }
            }

            class w6 implements aC.n {
                w6() {
                }

                @Override // com.alightcreative.app.motion.activities.creatorprogram.redeem.aC.n
                public com.alightcreative.app.motion.activities.creatorprogram.redeem.aC n(o.C c2) {
                    return new com.alightcreative.app.motion.activities.creatorprogram.redeem.aC(c2, j.this.f4375t.v(), j.this.f4375t.m(), j.this.f4375t.wTp(), j.this.f4374n.r());
                }
            }

            @Override // qp.InterfaceC2342j
            public Object get() {
                switch (this.nr) {
                    case 0:
                        return new C0145j();
                    case 1:
                        return new C0146n();
                    case 2:
                        return new w6();
                    case 3:
                        return new Ml();
                    case 4:
                        return new I28();
                    case 5:
                        return new Wre();
                    case 6:
                        return new CN3();
                    case 7:
                        return new fuX();
                    default:
                        throw new AssertionError(this.nr);
                }
            }

            j(fuX fux, Ml ml, n nVar, int i2) {
                this.f4374n = fux;
                this.rl = ml;
                this.f4375t = nVar;
                this.nr = i2;
            }
        }

        @Override // com.alightcreative.app.motion.activities.InterfaceC1736t
        public void J2(DevSettingsActivity devSettingsActivity) {
        }

        @Override // JqP.Dsr
        public void S(OnboardingActivity onboardingActivity) {
        }

        @Override // TX.fuX
        public void XQ(NewFeaturePagerActivity newFeaturePagerActivity) {
        }

        @Override // C.w6
        public void ck(ImportActivity importActivity) {
        }

        @Override // SNU.n
        public void g(CreatorRewardListActivity creatorRewardListActivity) {
        }

        @Override // com.alightcreative.app.motion.activities.GJj
        public void gh(SettingsActivity settingsActivity) {
        }

        private MainActivity B(MainActivity mainActivity) {
            eZk.rl(mainActivity, this.f4372n.r());
            eZk.mUb(mainActivity, (kgE.fuX) this.f4372n.aYN.get());
            eZk.ck(mainActivity, this.f4372n.eF());
            eZk.KN(mainActivity, this.rl.qie());
            eZk.nr(mainActivity, (Q.fuX) this.rl.f4330O.get());
            eZk.t(mainActivity, (xAo.qf) this.rl.J2.get());
            eZk.n(mainActivity, (xAo.I28) this.rl.nr.get());
            eZk.J2(mainActivity, (nYs.Ml) this.f4372n.f4352S.get());
            eZk.xMQ(mainActivity, this.rl.ty());
            eZk.Ik(mainActivity, (bH.CN3) this.f4372n.Uo.get());
            eZk.qie(mainActivity, (mD.j) this.f4372n.P5.get());
            eZk.HI(mainActivity, (g9s.n) this.nr.get());
            eZk.Uo(mainActivity, (InterfaceC2413n) this.f4372n.eF.get());
            eZk.O(mainActivity, (Dm5.n) this.f4372n.f4344E.get());
            eZk.ty(mainActivity, (CZF.I28) this.f4372n.qie.get());
            eZk.o(mainActivity, (cKn.Wre) this.f4372n.ck.get());
            eZk.az(mainActivity, (WK.I28) this.f4372n.nY.get());
            eZk.r(mainActivity, (Zs.n) this.f4372n.f4345FX.get());
            eZk.gh(mainActivity, (InterfaceC2210n) this.f4372n.rV9.get());
            return mainActivity;
        }

        private MediaBrowser D(MediaBrowser mediaBrowser) {
            gnv.n(mediaBrowser, this.f4372n.r());
            gnv.rl(mediaBrowser, (kgE.fuX) this.f4372n.aYN.get());
            return mediaBrowser;
        }

        private ElementDownloadActivity E(ElementDownloadActivity elementDownloadActivity) {
            Fg.Wre.rl(elementDownloadActivity, this.f4372n.r());
            Fg.Wre.nr(elementDownloadActivity, (kgE.fuX) this.f4372n.aYN.get());
            Fg.Wre.n(elementDownloadActivity, (xAo.I28) this.rl.nr.get());
            Fg.Wre.t(elementDownloadActivity, (nYs.Ml) this.f4372n.f4352S.get());
            Fg.Wre.O(elementDownloadActivity, (InterfaceC2210n) this.f4372n.rV9.get());
            return elementDownloadActivity;
        }

        private FontBrowserActivity FX(FontBrowserActivity fontBrowserActivity) {
            Hag.n(fontBrowserActivity, this.f4372n.r());
            Hag.rl(fontBrowserActivity, (kgE.fuX) this.f4372n.aYN.get());
            return fontBrowserActivity;
        }

        private PresetPreviewActivity GR(PresetPreviewActivity presetPreviewActivity) {
            com.alightcreative.maineditor.presetpreview.ui.CN3.J2(presetPreviewActivity, (fuX.n) this.KN.get());
            com.alightcreative.maineditor.presetpreview.ui.CN3.Uo(presetPreviewActivity, (g9s.n) this.nr.get());
            com.alightcreative.maineditor.presetpreview.ui.CN3.rl(presetPreviewActivity, this.f4372n.r());
            com.alightcreative.maineditor.presetpreview.ui.CN3.nr(presetPreviewActivity, (kgE.fuX) this.f4372n.aYN.get());
            com.alightcreative.maineditor.presetpreview.ui.CN3.n(presetPreviewActivity, (xAo.I28) this.rl.nr.get());
            com.alightcreative.maineditor.presetpreview.ui.CN3.t(presetPreviewActivity, (nYs.Ml) this.f4372n.f4352S.get());
            com.alightcreative.maineditor.presetpreview.ui.CN3.O(presetPreviewActivity, (InterfaceC2210n) this.f4372n.rV9.get());
            return presetPreviewActivity;
        }

        private PaywallActivity I(PaywallActivity paywallActivity) {
            com.alightcreative.monetization.ui.Ml.n(paywallActivity, (I28.n) this.mUb.get());
            return paywallActivity;
        }

        private ManageAccountActivity J(ManageAccountActivity manageAccountActivity) {
            com.alightcreative.app.motion.activities.nW.n(manageAccountActivity, this.f4372n.r());
            com.alightcreative.app.motion.activities.nW.rl(manageAccountActivity, (kgE.fuX) this.f4372n.aYN.get());
            return manageAccountActivity;
        }

        private ExportPreviewActivity M(ExportPreviewActivity exportPreviewActivity) {
            Y48.QJ.rl(exportPreviewActivity, this.f4372n.r());
            Y48.QJ.nr(exportPreviewActivity, (kgE.fuX) this.f4372n.aYN.get());
            Y48.QJ.n(exportPreviewActivity, (xAo.I28) this.rl.nr.get());
            Y48.QJ.t(exportPreviewActivity, (nYs.Ml) this.f4372n.f4352S.get());
            Y48.QJ.O(exportPreviewActivity, (InterfaceC2210n) this.f4372n.rV9.get());
            return exportPreviewActivity;
        }

        private EditActivity M7(EditActivity editActivity) {
            TP.KN(editActivity, (kgE.fuX) this.f4372n.aYN.get());
            TP.mUb(editActivity, (WK.I28) this.f4372n.nY.get());
            TP.nr(editActivity, (Q.fuX) this.rl.f4330O.get());
            TP.az(editActivity, this.f4372n.eF());
            TP.J2(editActivity, this.rl.qie());
            TP.Uo(editActivity, this.rl.ty());
            TP.rl(editActivity, this.f4372n.r());
            TP.n(editActivity, (xAo.I28) this.rl.nr.get());
            TP.t(editActivity, (xAo.qf) this.rl.J2.get());
            TP.gh(editActivity, (CZF.I28) this.f4372n.qie.get());
            TP.ty(editActivity, (cKn.Wre) this.f4372n.ck.get());
            TP.O(editActivity, (nYs.Ml) this.f4372n.f4352S.get());
            TP.qie(editActivity, (g9s.n) this.nr.get());
            TP.xMQ(editActivity, (InterfaceC2210n) this.f4372n.rV9.get());
            return editActivity;
        }

        private QAsActivity Nxk(QAsActivity qAsActivity) {
            com.alightcreative.app.motion.activities.creatorprogram.qas.ui.Wre.n(qAsActivity, (CN3.n) this.f4371O.get());
            return qAsActivity;
        }

        private DeviceMismatchNoticeActivity P5(DeviceMismatchNoticeActivity deviceMismatchNoticeActivity) {
            crp.n(deviceMismatchNoticeActivity, this.f4372n.r());
            return deviceMismatchNoticeActivity;
        }

        private ColorPickerActivity U(ColorPickerActivity colorPickerActivity) {
            QaP.n(colorPickerActivity, this.f4372n.r());
            return colorPickerActivity;
        }

        private AgreeDeleteAccountActivity Xw(AgreeDeleteAccountActivity agreeDeleteAccountActivity) {
            com.alightcreative.app.motion.activities.Sis.rl(agreeDeleteAccountActivity, (kgE.fuX) this.f4372n.aYN.get());
            com.alightcreative.app.motion.activities.Sis.n(agreeDeleteAccountActivity, this.f4372n.r());
            return agreeDeleteAccountActivity;
        }

        private RedeemTokensActivity Y(RedeemTokensActivity redeemTokensActivity) {
            com.alightcreative.app.motion.activities.creatorprogram.redeem.Wre.n(redeemTokensActivity, (aC.n) this.J2.get());
            return redeemTokensActivity;
        }

        private MyAccountActivity a(MyAccountActivity myAccountActivity) {
            fic.O(myAccountActivity, (kgE.fuX) this.f4372n.aYN.get());
            fic.t(myAccountActivity, this.f4372n.r());
            fic.rl(myAccountActivity, (xAo.I28) this.rl.nr.get());
            fic.nr(myAccountActivity, (nYs.Ml) this.f4372n.f4352S.get());
            fic.n(myAccountActivity, nHg());
            fic.J2(myAccountActivity, (InterfaceC2210n) this.f4372n.rV9.get());
            return myAccountActivity;
        }

        private AboutActivity bzg(AboutActivity aboutActivity) {
            com.alightcreative.app.motion.activities.M.t(aboutActivity, (kgE.fuX) this.f4372n.aYN.get());
            com.alightcreative.app.motion.activities.M.n(aboutActivity, (InterfaceC1335n) this.f4372n.KN.get());
            com.alightcreative.app.motion.activities.M.rl(aboutActivity, this.f4372n.r());
            return aboutActivity;
        }

        private StackedOffersPaywallActivity dR0(StackedOffersPaywallActivity stackedOffersPaywallActivity) {
            com.alightcreative.monetization.stackedintro.Dsr.n(stackedOffersPaywallActivity, (C.Ml) this.xMQ.get());
            return stackedOffersPaywallActivity;
        }

        private EffectBrowserActivity eF(EffectBrowserActivity effectBrowserActivity) {
            AbstractC1494z.O(effectBrowserActivity, (kgE.fuX) this.f4372n.aYN.get());
            AbstractC1494z.t(effectBrowserActivity, (Q.fuX) this.rl.f4330O.get());
            AbstractC1494z.rl(effectBrowserActivity, this.f4372n.r());
            AbstractC1494z.n(effectBrowserActivity, (xAo.I28) this.rl.nr.get());
            AbstractC1494z.nr(effectBrowserActivity, (nYs.Ml) this.f4372n.f4352S.get());
            return effectBrowserActivity;
        }

        private TutorialActivity ijL(TutorialActivity tutorialActivity) {
            Gu.QJ.rl(tutorialActivity, this.f4372n.r());
            Gu.QJ.nr(tutorialActivity, (kgE.fuX) this.f4372n.aYN.get());
            Gu.QJ.n(tutorialActivity, (xAo.I28) this.rl.nr.get());
            Gu.QJ.t(tutorialActivity, (nYs.Ml) this.f4372n.f4352S.get());
            Gu.QJ.O(tutorialActivity, (InterfaceC2210n) this.f4372n.rV9.get());
            return tutorialActivity;
        }

        private AudioBrowserActivity jB(AudioBrowserActivity audioBrowserActivity) {
            AbstractC2274Dsr.n(audioBrowserActivity, this.f4372n.r());
            return audioBrowserActivity;
        }

        private SaveToStorageActivity k(SaveToStorageActivity saveToStorageActivity) {
            Pf.n(saveToStorageActivity, this.f4372n.r());
            return saveToStorageActivity;
        }

        private EditProfileActivity p5(EditProfileActivity editProfileActivity) {
            F.n.n(editProfileActivity, this.rl.az());
            return editProfileActivity;
        }

        private TemplateImportPreviewActivity piY(TemplateImportPreviewActivity templateImportPreviewActivity) {
            com.alightcreative.template.importpreview.ui.fuX.rl(templateImportPreviewActivity, (Dsr.n) this.gh.get());
            com.alightcreative.template.importpreview.ui.fuX.n(templateImportPreviewActivity, this.f4372n.r());
            return templateImportPreviewActivity;
        }

        private void rV9(Activity activity) {
            this.nr = D23.Wre.n(new j(this.f4372n, this.rl, this.f4373t, 0));
            this.f4371O = D23.Wre.n(new j(this.f4372n, this.rl, this.f4373t, 1));
            this.J2 = D23.Wre.n(new j(this.f4372n, this.rl, this.f4373t, 2));
            this.Uo = D23.Wre.n(new j(this.f4372n, this.rl, this.f4373t, 3));
            this.KN = D23.Wre.n(new j(this.f4372n, this.rl, this.f4373t, 4));
            this.xMQ = D23.Wre.n(new j(this.f4372n, this.rl, this.f4373t, 5));
            this.mUb = D23.Wre.n(new j(this.f4372n, this.rl, this.f4373t, 6));
            this.gh = D23.Wre.n(new j(this.f4372n, this.rl, this.f4373t, 7));
        }

        private SurveyActivity z(SurveyActivity surveyActivity) {
            com.alightcreative.app.motion.activities.survey.Ml.n(surveyActivity, (I28.n) this.Uo.get());
            return surveyActivity;
        }

        @Override // BGJ.fuX.n
        public Xsz.Ml HI() {
            return new Dsr(this.f4372n, this.rl, this.f4373t);
        }

        @Override // Dj9.w6.InterfaceC0064w6
        public Map O() {
            return D23.n.t(com.google.common.collect.u.O(22).J2(i6.Dsr.f68107n, Boolean.valueOf(i6.CN3.n())).J2(l.Pl.f70375n, Boolean.valueOf(l.o.n())).J2(nN.CN3.f71058n, Boolean.valueOf(nN.I28.n())).J2(Ax.z.f203n, Boolean.valueOf(Ax.Xo.n())).J2(ka.Xo.f69985n, Boolean.valueOf(ka.qz.n())).J2(SNU.aC.f9747n, Boolean.valueOf(SNU.fuX.n())).J2(F.Pl.f2473n, Boolean.valueOf(F.o.n())).J2(IG.Dsr.f4114n, Boolean.valueOf(IG.CN3.n())).J2(D3C.UGc.f1246n, Boolean.valueOf(AbstractC1320c.n())).J2(C.Wre.f688n, Boolean.valueOf(C.Ml.n())).J2(U.f5149n, Boolean.valueOf(W.n())).J2(xuv.f6547n, Boolean.valueOf(RGN.n())).J2(yr.f6548n, Boolean.valueOf(VoU.n())).J2(tpM.f5239n, Boolean.valueOf(rfW.n())).J2(k9D.I28.f69659n, Boolean.valueOf(k9D.w6.n())).J2(JqP.Pl.f4701n, Boolean.valueOf(JqP.o.n())).J2(AbstractC1356c.f3094n, Boolean.valueOf(Fl.QJ.n())).J2(GW.Ew.f3557n, Boolean.valueOf(GW.afx.n())).J2(Pjo.Q.f7772n, Boolean.valueOf(Pjo.s4.n())).J2(f52.Q.f66492n, Boolean.valueOf(f52.s4.n())).J2(cd.lej.f43739n, Boolean.valueOf(cd.qf.n())).J2(xhQ.s4.f75471n, Boolean.valueOf(xhQ.l3D.n())).n());
        }

        @Override // BGJ.Wre.j
        public Xsz.w6 T() {
            return new Wre(this.f4372n, this.rl, this.f4373t);
        }

        @Override // Dj9.w6.InterfaceC0064w6
        public Xsz.I28 X() {
            return new C(this.f4372n, this.rl);
        }

        com.alightcreative.app.motion.activities.creatorprogram.redeem.fuX m() {
            return new com.alightcreative.app.motion.activities.creatorprogram.redeem.fuX(this.f4372n.r());
        }

        rO.j nHg() {
            return new rO.j(this.f4372n.r());
        }

        Nf7.j s7N() {
            return new Nf7.j((kgE.fuX) this.f4372n.aYN.get());
        }

        W.n v() {
            return new W.n((nYs.Ml) this.f4372n.f4352S.get(), (cg.qz) this.f4372n.ViF.get());
        }

        W.j wTp() {
            return new W.j((kgE.fuX) this.f4372n.aYN.get(), (cg.Dsr) this.f4372n.jB.get());
        }

        n(fuX fux, Ml ml, Activity activity) {
            this.f4372n = fux;
            this.rl = ml;
            rV9(activity);
        }

        @Override // com.alightcreative.app.motion.activities.CAG
        public void E2(MyAccountActivity myAccountActivity) {
            a(myAccountActivity);
        }

        @Override // yUp.Ml
        public void Ik(QAsActivity qAsActivity) {
            Nxk(qAsActivity);
        }

        @Override // Y48.z
        public void KN(ExportPreviewActivity exportPreviewActivity) {
            M(exportPreviewActivity);
        }

        @Override // com.alightcreative.app.motion.activities.CM
        public void N(DeviceMismatchNoticeActivity deviceMismatchNoticeActivity) {
            P5(deviceMismatchNoticeActivity);
        }

        @Override // Fg.I28
        public void Uo(ElementDownloadActivity elementDownloadActivity) {
            E(elementDownloadActivity);
        }

        @Override // K.n
        public void ViF(StackedOffersPaywallActivity stackedOffersPaywallActivity) {
            dR0(stackedOffersPaywallActivity);
        }

        @Override // xr.C
        public void WPU(TemplateImportPreviewActivity templateImportPreviewActivity) {
            piY(templateImportPreviewActivity);
        }

        @Override // com.alightcreative.app.motion.activities.pO
        public void Z(AgreeDeleteAccountActivity agreeDeleteAccountActivity) {
            Xw(agreeDeleteAccountActivity);
        }

        @Override // cd.QJ
        public void aYN(PaywallActivity paywallActivity) {
            I(paywallActivity);
        }

        @Override // D5a.LEl
        public void az(MediaBrowser mediaBrowser) {
            D(mediaBrowser);
        }

        @Override // yvM.Wre
        public void e(PresetPreviewActivity presetPreviewActivity) {
            GR(presetPreviewActivity);
        }

        @Override // com.alightcreative.app.motion.activities.Bu
        public void fD(EditActivity editActivity) {
            M7(editActivity);
        }

        @Override // MO.w6
        public void iF(RedeemTokensActivity redeemTokensActivity) {
            Y(redeemTokensActivity);
        }

        @Override // Y.eO
        public void mUb(EffectBrowserActivity effectBrowserActivity) {
            eF(effectBrowserActivity);
        }

        @Override // Dj9.j.InterfaceC0063j
        public j.w6 n() {
            return Dj9.n.n(O(), new C(this.f4372n, this.rl));
        }

        @Override // Gu.z
        public void nY(TutorialActivity tutorialActivity) {
            ijL(tutorialActivity);
        }

        @Override // com.alightcreative.app.motion.activities.sVY
        public void nr(FontBrowserActivity fontBrowserActivity) {
            FX(fontBrowserActivity);
        }

        @Override // com.alightcreative.app.motion.activities.YzO
        public void o(ColorPickerActivity colorPickerActivity) {
            U(colorPickerActivity);
        }

        @Override // m.InterfaceC2284fuX
        public void qie(AudioBrowserActivity audioBrowserActivity) {
            jB(audioBrowserActivity);
        }

        @Override // com.alightcreative.app.motion.activities.iwV
        public void r(AboutActivity aboutActivity) {
            bzg(aboutActivity);
        }

        @Override // F.j
        public void rl(EditProfileActivity editProfileActivity) {
            p5(editProfileActivity);
        }

        @Override // com.alightcreative.app.motion.activities.Cw1
        public void t(SaveToStorageActivity saveToStorageActivity) {
            k(saveToStorageActivity);
        }

        @Override // KC.yr
        public void te(MainActivity mainActivity) {
            B(mainActivity);
        }

        @Override // ID.Ml
        public void ty(SurveyActivity surveyActivity) {
            z(surveyActivity);
        }

        @Override // com.alightcreative.app.motion.activities.fc
        public void xMQ(ManageAccountActivity manageAccountActivity) {
            J(manageAccountActivity);
        }
    }

    private static final class o extends IvA.Dsr {
        D23.Ml HI;
        D23.Ml Ik;
        D23.Ml J2;
        D23.Ml KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        D23.Ml f4384O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        D23.Ml f4385S;
        D23.Ml Uo;
        D23.Ml ViF;
        D23.Ml WPU;
        D23.Ml XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        D23.Ml f4386Z;
        D23.Ml aYN;
        D23.Ml az;
        D23.Ml ck;
        D23.Ml gh;
        D23.Ml mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SavedStateHandle f4387n;
        D23.Ml nY;
        private final o nr = this;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        D23.Ml f4388o;
        D23.Ml qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        D23.Ml f4389r;
        private final fuX rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Ml f4390t;
        D23.Ml ty;
        D23.Ml xMQ;

        private static final class j implements D23.Ml {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final fuX f4391n;
            private final int nr;
            private final Ml rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final o f4392t;

            /* JADX INFO: renamed from: IvA.qz$o$j$j, reason: collision with other inner class name */
            class C0147j implements r.I28 {
                C0147j() {
                }

                @Override // GW.r.I28
                public GW.r n(TemplateFiltersItem.Content content, int i2) {
                    return new GW.r((pP.Wre) j.this.f4391n.f4346GR.get(), j.this.f4391n.r(), content, i2);
                }
            }

            class n implements QJ.w6 {
                n() {
                }

                @Override // Pjo.QJ.w6
                public Pjo.QJ create(String str) {
                    return new Pjo.QJ((pP.Wre) j.this.f4391n.f4346GR.get(), j.this.f4391n.r(), str);
                }
            }

            @Override // qp.InterfaceC2342j
            public Object get() {
                switch (this.nr) {
                    case 0:
                        return new i6.Wre((Asx.n) this.f4391n.f4343D.get());
                    case 1:
                        return new l.CN3(this.f4391n.mUb(), this.f4391n.HI(), this.f4391n.ck(), this.f4391n.rV9(), (wtO.Wre) this.f4391n.f4347I.get(), this.f4391n.E2(), this.f4391n.gh(), this.f4391n.r(), (xAo.I28) this.rl.nr.get(), (nYs.Ml) this.f4391n.f4352S.get(), (InterfaceC2210n) this.f4391n.rV9.get());
                    case 2:
                        return new nN.Ml((kgE.fuX) this.f4391n.aYN.get(), (nYs.Ml) this.f4391n.f4352S.get(), this.f4392t.O());
                    case 3:
                        return new Ax.Pl((kgE.fuX) this.f4391n.aYN.get(), (nYs.Ml) this.f4391n.f4352S.get(), this.f4392t.Uo());
                    case 4:
                        return new ka.aC((nYs.Ml) this.f4391n.f4352S.get(), this.f4392t.J2(), this.f4392t.Uo(), (kgE.fuX) this.f4391n.aYN.get());
                    case 5:
                        return new com.alightcreative.app.motion.activities.creatorprogram.rewardlist.I28(this.f4392t.KN(), this.f4392t.O(), this.f4391n.r());
                    case 6:
                        return new com.alightcreative.app.motion.ranking.ui.editprofile.Wre(this.f4391n.r(), this.f4392t.Uo(), this.f4392t.mUb());
                    case 7:
                        return new IG.Ml(new U.n(), this.rl.mUb(), this.rl.KN(), this.rl.O(), new Ko8.n(), new Xfx.j(), new Xfx.n(), this.rl.t(), new Je.I28(), this.rl.o(), (WK.I28) this.f4391n.nY.get(), this.f4391n.r());
                    case 8:
                        return new D3C.QJ((pP.Wre) this.f4391n.f4346GR.get(), this.f4391n.r());
                    case 9:
                        return new com.alightcreative.importer.xml.ui.w6(this.rl.HI(), this.f4391n.r());
                    case 10:
                        return new com.alightcreative.app.motion.activities.main.r(this.f4391n.r(), this.f4392t.mUb(), new U.n());
                    case 11:
                        return new kO4(new U.n(), new U.Ml(), (WK.I28) this.f4391n.nY.get(), this.f4391n.r(), (nYs.Ml) this.f4391n.f4352S.get(), (kgE.fuX) this.f4391n.aYN.get(), this.f4391n.gh(), this.f4391n.E2(), this.f4391n.rV9(), this.rl.HI());
                    case 12:
                        return new OA(this.rl.HI(), new U.n(), new U.Ml(), this.rl.Uo(), this.f4391n.r(), (nYs.Ml) this.f4391n.f4352S.get());
                    case 13:
                        return new com.alightcreative.app.motion.activities.main.ci((nYs.Ml) this.f4391n.f4352S.get(), (Asx.n) this.f4391n.f4343D.get(), (InterfaceC2413n) this.f4391n.eF.get(), (Zs.j) this.f4391n.f4361k.get());
                    case 14:
                        return new k9D.n(this.f4392t.nr(), this.f4392t.mUb(), this.f4391n.r());
                    case 15:
                        return new com.alightcreative.onboarding.ui.w6(this.f4391n.r(), (nYs.Ml) this.f4391n.f4352S.get(), this.rl.az());
                    case 16:
                        return new Fl.z((vjm.j) this.f4391n.f4367z.get(), (vjm.n) this.f4391n.ijL.get(), (InterfaceC2413n) this.f4391n.eF.get());
                    case 17:
                        return new f52.l3D((pP.Wre) this.f4391n.f4346GR.get(), this.f4391n.r());
                    case 18:
                        return new cd.u((xAo.I28) this.rl.nr.get(), this.rl.nr(), new WaZ.j(), this.f4391n.r());
                    case 19:
                        return new xhQ.QJ(this.f4392t.f4387n, this.rl.qie(), (xAo.I28) this.rl.nr.get(), (xAo.qf) this.rl.J2.get(), (nYs.Ml) this.f4391n.f4352S.get(), (InterfaceC2210n) this.f4391n.rV9.get());
                    case 20:
                        return new C0147j();
                    case 21:
                        return new n();
                    default:
                        throw new AssertionError(this.nr);
                }
            }

            j(fuX fux, Ml ml, o oVar, int i2) {
                this.f4391n = fux;
                this.rl = ml;
                this.f4392t = oVar;
                this.nr = i2;
            }
        }

        private void xMQ(SavedStateHandle savedStateHandle, OM5.w6 w6Var) {
            this.f4384O = new j(this.rl, this.f4390t, this.nr, 0);
            this.J2 = new j(this.rl, this.f4390t, this.nr, 1);
            this.Uo = new j(this.rl, this.f4390t, this.nr, 2);
            this.KN = new j(this.rl, this.f4390t, this.nr, 3);
            this.xMQ = new j(this.rl, this.f4390t, this.nr, 4);
            this.mUb = new j(this.rl, this.f4390t, this.nr, 5);
            this.gh = new j(this.rl, this.f4390t, this.nr, 6);
            this.qie = new j(this.rl, this.f4390t, this.nr, 7);
            this.az = new j(this.rl, this.f4390t, this.nr, 8);
            this.ty = new j(this.rl, this.f4390t, this.nr, 9);
            this.HI = new j(this.rl, this.f4390t, this.nr, 10);
            this.ck = new j(this.rl, this.f4390t, this.nr, 11);
            this.Ik = new j(this.rl, this.f4390t, this.nr, 12);
            this.f4389r = new j(this.rl, this.f4390t, this.nr, 13);
            this.f4388o = new j(this.rl, this.f4390t, this.nr, 14);
            this.f4386Z = new j(this.rl, this.f4390t, this.nr, 15);
            this.XQ = new j(this.rl, this.f4390t, this.nr, 16);
            this.f4385S = new j(this.rl, this.f4390t, this.nr, 17);
            this.WPU = new j(this.rl, this.f4390t, this.nr, 18);
            this.aYN = new j(this.rl, this.f4390t, this.nr, 19);
            this.ViF = D23.Wre.n(new j(this.rl, this.f4390t, this.nr, 20));
            this.nY = D23.Wre.n(new j(this.rl, this.f4390t, this.nr, 21));
        }

        Jfs.n J2() {
            return new Jfs.n(this.rl.r());
        }

        W.n KN() {
            return new W.n((nYs.Ml) this.rl.f4352S.get(), (cg.qz) this.rl.ViF.get());
        }

        W.j O() {
            return new W.j((kgE.fuX) this.rl.aYN.get(), (cg.Dsr) this.rl.jB.get());
        }

        Jfs.w6 Uo() {
            return new Jfs.w6((kgE.fuX) this.rl.aYN.get());
        }

        Jfs.CN3 mUb() {
            return new Jfs.CN3(this.rl.r());
        }

        @Override // Dj9.w6.Ml
        public Map n() {
            return D23.n.t(com.google.common.collect.u.O(20).J2(i6.fuX.f68116n, this.f4384O).J2(l.qz.f70384n, this.J2).J2(nN.Wre.f71074n, this.Uo).J2(Ax.eO.f168n, this.KN).J2(ka.Pl.f69970n, this.xMQ).J2(SNU.Dsr.f9739n, this.mUb).J2(F.qz.f2481n, this.gh).J2(IG.fuX.f4132n, this.qie).J2(D3C.s4.f1291n, this.az).J2(C.I28.f687n, this.ty).J2(t6.f5235n, this.HI).J2(M.B.f6251n, this.ck).J2(s6u.f6521n, this.Ik).J2(tmw.f5238n, this.f4389r).J2(k9D.Ml.f69660n, this.f4388o).J2(JqP.qz.f4722n, this.f4386Z).J2(Fl.l3D.f3105n, this.XQ).J2(f52.UGc.f66499n, this.f4385S).J2(cd.Ln.f43705n, this.WPU).J2(AbstractC2426c.f75461n, this.aYN).n());
        }

        rO.j nr() {
            return new rO.j(this.rl.r());
        }

        @Override // Dj9.w6.Ml
        public Map rl() {
            return D23.n.t(com.google.common.collect.u.ck(GW.Z.f3588n, this.ViF.get(), Pjo.UGc.f7791n, this.nY.get()));
        }

        o(fuX fux, Ml ml, SavedStateHandle savedStateHandle, OM5.w6 w6Var) {
            this.rl = fux;
            this.f4390t = ml;
            this.f4387n = savedStateHandle;
            xMQ(savedStateHandle, w6Var);
        }
    }

    /* JADX INFO: renamed from: IvA.qz$qz, reason: collision with other inner class name */
    private static final class C0148qz implements Xsz.Wre {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private View f4395O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4396n;
        private final CN3 nr;
        private final Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n f4397t;

        private C0148qz(fuX fux, Ml ml, n nVar, CN3 cn3) {
            this.f4396n = fux;
            this.rl = ml;
            this.f4397t = nVar;
            this.nr = cn3;
        }

        @Override // Xsz.Wre
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public IvA.aC build() {
            D23.w6.n(this.f4395O, View.class);
            return new Pl(this.f4396n, this.rl, this.f4397t, this.nr, this.f4395O);
        }

        @Override // Xsz.Wre
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public C0148qz n(View view) {
            this.f4395O = (View) D23.w6.rl(view);
            return this;
        }
    }

    private static final class w6 implements Xsz.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4398n;
        private BGJ.CN3 rl;

        private w6(fuX fux) {
            this.f4398n = fux;
        }

        @Override // Xsz.n
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public IvA.I28 build() {
            D23.w6.n(this.rl, BGJ.CN3.class);
            return new Ml(this.f4398n, this.rl);
        }

        @Override // Xsz.n
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public w6 n(BGJ.CN3 cn3) {
            this.rl = (BGJ.CN3) D23.w6.rl(cn3);
            return this;
        }
    }

    private static final class Pl extends IvA.aC {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Pl f4335O = this;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final fuX f4336n;
        private final CN3 nr;
        private final Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n f4337t;

        Pl(fuX fux, Ml ml, n nVar, CN3 cn3, View view) {
            this.f4336n = fux;
            this.rl = ml;
            this.f4337t = nVar;
            this.nr = cn3;
        }
    }

    public static I28 n() {
        return new I28();
    }
}
