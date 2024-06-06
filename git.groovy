pipeline(main){
			   agent:any
			   stages{
					  stage(git){
								 git -username
								 git logs --oneline
								 }
					}
			  }
