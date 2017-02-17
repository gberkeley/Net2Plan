/*******************************************************************************
 * Copyright (c) 2015 Pablo Pavon Mariño.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Contributors:
 * Pablo Pavon Mariño - initial API and implementation
 ******************************************************************************/


package com.net2plan.interfaces.networkDesign;

import com.net2plan.interfaces.ITopologyCanvas;
import com.net2plan.interfaces.ITopologyCanvasVertex;
import com.net2plan.internal.Constants;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Collection;
import java.util.Set;

/**
 * Interface to be implemented by any class dealing with network designs.
 */
public interface IVisualizationCallback
{
	void resetPickedStateAndUpdateView ();

    void putTransientColorInElementTopologyCanvas (Collection<? extends NetworkElement> linksAndNodes , Color color);

	void updateVisualizationJustTables ();

	void updateVisualizationJustCanvasLinkNodeVisibilityOrColor ();

	void updateVisualizationAfterNewTopology ();

	NetPlan getDesign();

    NetPlan getInitialDesign();

	void updateVisualizationAfterChanges (Set<Constants.NetworkElementType> modificationsMade);

    boolean inOnlineSimulationMode();

	void setCurrentNetPlanDoNotUpdateVisualization(NetPlan netPlan);

	void updateVisualizationAfterPick();

	// TODO: Rethink if this one is needed...
	void moveNodeTo(ITopologyCanvasVertex guiNode, Point2D toPoint);

	void runCanvasOperation(ITopologyCanvas.CanvasOperation... canvasOperation);

	void requestUndoAction();

	void requestRedoAction();
}