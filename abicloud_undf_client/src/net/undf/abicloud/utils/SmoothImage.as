/*
* The contents of this file are subject to the Common Public Attribution License

* Version 1.0 (the "License"); you may not use this file except in compliance
* with the License. You may obtain a copy of the License at http://cpal.abiquo.com.



* The License is based on the Mozilla Public License Version 1.1 but Sections 14
* and 15 have been added to cover use of software over a computer network and
* provide for limited attribution for the Original Developer. In addition,



* Exhibit A has been modified to be consistent with Exhibit B.
*
* Software distributed under the License is distributed on an "AS IS" basis,
* WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License



* for the specific language governing rights and limitations under the License.
*
* The Original Code is abiquo,  14 Jul 2008. The Original Developer is the
* Initial Developer. The Initial Developer of the Original Code is Soluciones Grid,



* S.L.. All portions of the code are Copyright © Soluciones Grid, S.L.
* All Rights Reserved.
*/

package net.undf.abicloud.utils
{
	import mx.controls.Image;
	import mx.core.BitmapAsset;
	import mx.events.FlexEvent;

	public class SmoothImage extends Image 
	{
		public function SmoothImage() 
		{
			super();
			addEventListener(FlexEvent.CREATION_COMPLETE, smoothImage);
			addEventListener(FlexEvent.UPDATE_COMPLETE, smoothImage);
		}
			
		private function smoothImage(event:FlexEvent):void 
		{
			var bitmap:BitmapAsset = ((event.target as Image).content as BitmapAsset);
			if (bitmap != null) 
			{
				bitmap.smoothing = true; 
			} 
			else 
			{
				if (event.target.content != null) 
				{
					if (event.target.content.hasOwnProperty('smoothing'))
						event.target.content.smoothing = true;
				}
			}
		}
	
	} 
}