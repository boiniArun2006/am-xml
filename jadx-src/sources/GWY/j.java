package GWY;

import HI0.afx;
import android.app.Activity;
import android.content.Context;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class j {
    public static final UUID O(Context context, Scene scene) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNull(uuidRandomUUID);
        FilesKt.writeText$default(afx.Z(context, uuidRandomUUID), SceneSerializerKt.serializeScene$default(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 524287, null), false, null, false, false, null, 62, null), null, 2, null);
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (CollectionsKt.contains(jVar.getImportedXmlIds(), scene.getTemplateLink())) {
            jVar.setImportedXmlIds(SetsKt.plus(jVar.getImportedXmlIds(), uuidRandomUUID.toString()));
            return uuidRandomUUID;
        }
        jVar.setImportedProjectIds(SetsKt.plus(jVar.getImportedProjectIds(), uuidRandomUUID.toString()));
        return uuidRandomUUID;
    }

    public static final String n(List list, int i2, String separator, String ellipsis) {
        Intrinsics.checkNotNullParameter(list, obbPUqyhtS.kFfDb);
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(ellipsis, "ellipsis");
        if (i2 < 1) {
            throw new IllegalArgumentException("When calling concatenateProjectTitle, the maxCount argument must be at least 1.");
        }
        if (list.size() <= i2) {
            return CollectionsKt.joinToString$default(list, separator, null, null, 0, null, null, 62, null);
        }
        return CollectionsKt.joinToString$default(CollectionsKt.take(list, i2 / 2), separator, null, null, 0, null, null, 62, null) + separator + ellipsis + separator + CollectionsKt.joinToString$default(CollectionsKt.takeLast(list, (i2 - 1) / 2), separator, null, null, 0, null, null, 62, null);
    }

    public static final UUID nr(Activity activity, String projectId) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        return O(activity, SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(afx.o(activity, projectId), null, 1, null), false, false, false, 14, null));
    }

    public static /* synthetic */ String rl(List list, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 & 4) != 0) {
            str = "\n";
        }
        if ((i3 & 8) != 0) {
            str2 = "…";
        }
        return n(list, i2, str, str2);
    }

    public static final void t(Activity activity, String id) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        com.alightcreative.app.motion.persist.j.INSTANCE.getProjectEditTime().remove(id);
        afx.o(activity, id).delete();
        afx.XQ(activity, id).delete();
        afx.WPU(activity, id).delete();
    }
}
