	// JavaScript Document

	function $_getID(id)
	{
		return document.getElementById(id);
	}
		
	function leftList(thisID,thisImgID)
	{	
		thisID = parent.document.getElementById(thisID);
		thisImgID = document.getElementById(thisImgID);
		if (thisID.cols == "200,8,*")
		{
			thisID.cols = "0,8,*";
			thisImgID.className = "hidden";
		}
		else
		{
			thisID.cols = "200,8,*";
			thisImgID.className = "show";
		}
	}

	
	function FrameRedirect(frameId, url)
	{
		if (parent.document.getElementById(frameId) != null)
		{
			parent.document.getElementById(frameId).src  = url;
		}
	}