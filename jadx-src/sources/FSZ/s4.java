package FSZ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class s4 {

    class j implements SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ l3D f2624n;

        j(l3D l3d) {
            this.f2624n = l3d;
        }

        @Override // FSZ.SPz
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public void t(lN.Ml ml) {
            this.f2624n.n(ml);
        }

        @Override // FSZ.SPz
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public void rl(lN.Ml ml) {
            this.f2624n.gh(ml);
        }

        @Override // FSZ.SPz
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void n(lN.Ml ml) {
            this.f2624n.Uo(ml);
        }
    }

    public static C1348c n(Q q2, l3D l3d) {
        l3d.O(q2);
        return new C1348c(q2, new j(l3d));
    }
}
