package uOq;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f74363n = new Dsr() { // from class: uOq.fuX
        @Override // uOq.Dsr
        public final List n(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List n(ComponentRegistrar componentRegistrar);
}
