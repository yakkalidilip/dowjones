DROP TABLE IF EXISTS DOWJONES;
 
CREATE TABLE DOWJONES (
  quarter VARCHAR(250) NOT NULL,
  stock VARCHAR(250) NOT NULL,
  date VARCHAR(250) NOT NULL,
  open VARCHAR(250) NOT  NULL,
  high VARCHAR(250) NOT  NULL,
  low VARCHAR(250) NOT  NULL,
  close VARCHAR(250) NOT  NULL,
  volume VARCHAR(250) NOT  NULL,
  percentChangePrice VARCHAR(250) NOT  NULL,
  percentChangeVolumeOverLastWk VARCHAR(250) NOT  NULL,
  previousWeeksVolume VARCHAR(250) NOT  NULL,
  nextWeeksOpen VARCHAR(250) NOT  NULL,
  nextWeeksClose VARCHAR(250) NOT  NULL,
  percentChangeNextWeeksPrice VARCHAR(250) NOT  NULL,
  daysToNextDividend VARCHAR(250) NOT  NULL,
  percentReturnNextDividend VARCHAR(250) NOT  NULL
  
);
