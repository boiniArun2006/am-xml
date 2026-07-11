package Vi;

import LM.aC;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface CN3 extends Dsr {

    public static final class j {
        public static /* synthetic */ void n(CN3 cn3, six.fuX fux, ProjectInfo.n nVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteSelectedProjects");
            }
            if ((i2 & 2) != 0) {
                nVar = null;
            }
            cn3.r(fux, nVar);
        }

        public static /* synthetic */ void rl(CN3 cn3, SceneType sceneType, ProjectInfo.n nVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: duplicateSelectedProjects");
            }
            if ((i2 & 2) != 0) {
                nVar = null;
            }
            cn3.rl(sceneType, nVar);
        }
    }

    List Ik();

    void N();

    SceneThumbnailMaker S();

    boolean T();

    void WPU(String str, aC aCVar);

    void nr(ProjectInfo projectInfo);

    void r(six.fuX fux, ProjectInfo.n nVar);

    void rl(SceneType sceneType, ProjectInfo.n nVar);

    void ty(ProjectInfo.n nVar);

    /* JADX INFO: renamed from: v */
    Set getProjectTitles();
}
