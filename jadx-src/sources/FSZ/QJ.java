package FSZ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class QJ {

    class j implements SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ l3D f2599n;

        j(l3D l3d) {
            this.f2599n = l3d;
        }

        @Override // FSZ.SPz
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void t(lN.Ml ml) {
            this.f2599n.ty(ml);
        }

        @Override // FSZ.SPz
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public void rl(lN.Ml ml) {
            this.f2599n.qie(ml);
        }

        @Override // FSZ.SPz
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void n(lN.Ml ml) {
            this.f2599n.J2(ml);
        }
    }

    public static C1348c n(Q q2, l3D l3d) {
        l3d.nr(q2);
        return new C1348c(q2, new j(l3d));
    }
}
