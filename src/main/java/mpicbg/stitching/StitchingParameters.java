/*
 * #%L
 * Fiji distribution of ImageJ for the life sciences.
 * %%
 * Copyright (C) 2007 - 2017 Fiji
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */
package mpicbg.stitching;

import mpicbg.imglib.container.ContainerFactory;
import mpicbg.imglib.container.array.ArrayContainerFactory;

public class StitchingParameters {
	/**
	 * If we cannot wrap, which factory do we use for computing the phase
	 * correlation
	 */
	public static ContainerFactory phaseCorrelationFactory = new ArrayContainerFactory();

	/**
	 * If you want to force that the {@link ContainerFactory} above is always used
	 * set this to true
	 */
	public static boolean alwaysCopy = false;

	/** 维度 */
	public int dimensionality;
	/** 融合方法.具体值参考{@link CommonFunctions.methodList} */
	public int fusionMethod = 0;
	public String fusedName;
	public int checkPeaks;
	/** 图块是否需要切割 */
	public boolean addTilesAsRois = false;
	/** 是否计算重叠. 否则使用近似网格坐标 */
	public boolean computeOverlap;
	/** 亚像素精度 */
	public boolean subpixelAccuracy; 
	/** 是否忽略零值融合 */
	public boolean ignoreZeroValuesFusion = false; 
	/** 是否下采样图块 */
	public boolean downSample = false;
	/** 是否显示融合 */
	public boolean displayFusion = false;
	/** 是否反转x,y坐标 */
	public boolean invertX = false, invertY = false;
	/** 是否忽略z轴位置 */
	public boolean ignoreZStage;
	public double xOffset;
	public double yOffset;
	public double zOffset;

	/** 是否使用虚拟输入图像. 缓慢!甚至在融合过程中与亚像素精度结合时甚至更慢 */
	public boolean virtual = false;
	public int channel1;
	public int channel2;

	public int timeSelect;

	/** 计算参数选择.值参考{@link CommonFunctions.cpuMemSelect} */
	public int cpuMemChoice = 1;
	/** 输出设置参数.可用值: 0 == fuse&display, 1 == writeToDisk */ 
	public int outputVariant = 1;
	/** 输出路径 */
	public String outputDirectory = null;

	/** 回归阈值 */
	public double regThreshold = -2;
	/** 最大/平均位移阈值 */
	public double relativeThreshold = 2.5;
	/** 绝对位移阈值 */
	public double absoluteThreshold = 3.5;

	// added by John Lapage: allows storage of a sequential comparison range
	public boolean sequential = false;
	public int seqRange = 1;

}
