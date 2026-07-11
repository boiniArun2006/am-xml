package com.alightcreative.app.motion.scene;

import android.graphics.Path;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0001¨\u0006\u000b"}, d2 = {"qbSplineFromPoints", "Lcom/alightcreative/app/motion/scene/QBSpline;", "points", "", "Lcom/alightcreative/app/motion/scene/QBPoint;", "([Lcom/alightcreative/app/motion/scene/QBPoint;)Lcom/alightcreative/app/motion/scene/QBSpline;", "qbMutableSplineFromPoints", "Lcom/alightcreative/app/motion/scene/MutableQBSpline;", "([Lcom/alightcreative/app/motion/scene/QBPoint;)Lcom/alightcreative/app/motion/scene/MutableQBSpline;", "toPath", "Landroid/graphics/Path;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QBSplineKt {
    public static final MutableQBSpline qbMutableSplineFromPoints(QBPoint... points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return new MutableQBSpline(points) { // from class: com.alightcreative.app.motion.scene.QBSplineKt.qbMutableSplineFromPoints.1
            private final List<QBPoint> _points;

            @Override // com.alightcreative.app.motion.scene.MutableQBSpline, com.alightcreative.app.motion.scene.QBSpline
            public List<QBPoint> getPoints() {
                return this._points;
            }

            public final List<QBPoint> get_points() {
                return this._points;
            }

            {
                this._points = ArraysKt.toMutableList(points);
            }
        };
    }

    public static final QBSpline qbSplineFromPoints(QBPoint... points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return new QBSpline(points) { // from class: com.alightcreative.app.motion.scene.QBSplineKt.qbSplineFromPoints.1
            private final List<QBPoint> _points;

            @Override // com.alightcreative.app.motion.scene.QBSpline
            public List<QBPoint> getPoints() {
                return this._points;
            }

            public final List<QBPoint> get_points() {
                return this._points;
            }

            {
                this._points = ArraysKt.toList(points);
            }
        };
    }

    public static final Path toPath(QBSpline qBSpline) {
        Intrinsics.checkNotNullParameter(qBSpline, "<this>");
        Path path = new Path();
        if (qBSpline.getPoints().size() < 2) {
            return path;
        }
        QBPoint qBPoint = (QBPoint) CollectionsKt.first((List) qBSpline.getPoints());
        QBPoint qBPoint2 = (QBPoint) CollectionsKt.last((List) qBSpline.getPoints());
        QBPoint qBPoint3 = qBSpline.getPoints().get(CollectionsKt.getLastIndex(qBSpline.getPoints()) - 1);
        if (qBPoint2.getOnCurve()) {
            path.moveTo(qBPoint2.getX(), qBPoint2.getY());
        } else if (!qBPoint.getOnCurve()) {
            float f3 = 2;
            path.moveTo((qBPoint.getX() + qBPoint2.getX()) / f3, (qBPoint.getY() + qBPoint2.getY()) / f3);
        } else if (qBPoint3.getOnCurve()) {
            path.moveTo(qBPoint3.getX(), qBPoint3.getY());
        } else {
            float f4 = 2;
            path.moveTo((qBPoint3.getX() + qBPoint2.getX()) / f4, (qBPoint3.getY() + qBPoint2.getY()) / f4);
        }
        for (QBPoint qBPoint4 : CollectionsKt.plus((Collection<? extends Object>) qBSpline.getPoints(), CollectionsKt.first((List) qBSpline.getPoints()))) {
            if (qBPoint4.getOnCurve()) {
                if (qBPoint2.getOnCurve()) {
                    path.lineTo(qBPoint4.getX(), qBPoint4.getY());
                } else {
                    path.quadTo(qBPoint2.getX(), qBPoint2.getY(), qBPoint4.getX(), qBPoint4.getY());
                }
            } else if (!qBPoint2.getOnCurve()) {
                float f5 = 2;
                path.quadTo(qBPoint2.getX(), qBPoint2.getY(), (qBPoint2.getX() + qBPoint4.getX()) / f5, (qBPoint2.getY() + qBPoint4.getY()) / f5);
            }
            qBPoint2 = qBPoint4;
        }
        path.close();
        return path;
    }
}
