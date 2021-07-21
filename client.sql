USE [client_languages]
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Client](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NOT NULL,
	[firstsurname] [varchar](50) NOT NULL,
	[secondsurname] [varchar](50) NOT NULL,
	[address] [varchar](250) NOT NULL,
	[phone] [varchar](50) NOT NULL,
	[secondcontact] [varchar](50) NOT NULL,
	[email] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[television] [int] NULL,
	[mobilephone] [int] NULL,
	[telephone] [int] NULL,
	[internet] [int] NULL,
	[creationdate] [date] NULL,
	[creationuser] [varchar](20) NULL,
	[updatedate] [date] NULL,
	[updateuser] [varchar](20) NULL,
 CONSTRAINT [PK_client] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Client] ADD  CONSTRAINT [DFCreationDateClient]  DEFAULT (getdate()) FOR [creationdate]
GO
------------------------------------------------------------------------------------------------------------------
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Comment](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[description] [varchar](250) NOT NULL,
	[idissue] [int] NULL,
	[reportnumber] [varchar](100) NULL,
	[creationdate] [date] NULL,
	[creationuser] [varchar](20) NULL,
	[updatedate] [date] NULL,
	[updateuser] [varchar](20) NULL,
 CONSTRAINT [PK_comment] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Comment] ADD  CONSTRAINT [DFCreationDateComment]  DEFAULT (getdate()) FOR [creationdate]
GO

ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FKCommentIssue] FOREIGN KEY([idissue])
REFERENCES [dbo].[Issue] ([id])
GO

ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FKCommentIssue]
GO
------------------------------------------------------------------------------------------------------------------
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Issue](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[reportnumber] [varchar](100) NOT NULL,
	[address] [varchar](250) NOT NULL,
	[contactphone] [varchar](50) NOT NULL,
	[contactemail] [varchar](50) NOT NULL,
	[status] [varchar](50) NOT NULL,
	[supportuserasigned] [varchar](50) NULL,
	[iduser] [int] NULL,
	[description] [varchar](50) NULL,
	[service] [varchar](50) NULL,
	[creationdate] [date] NULL,
	[creationuser] [varchar](20) NULL,
	[updatedate] [date] NULL,
	[updateuser] [varchar](20) NULL,
 CONSTRAINT [PK_issue] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Issue] ADD  CONSTRAINT [DFCreationDateIssue]  DEFAULT (getdate()) FOR [creationdate]
GO

ALTER TABLE [dbo].[Issue]  WITH CHECK ADD  CONSTRAINT [FK_IssueUser] FOREIGN KEY([iduser])
REFERENCES [dbo].[Client] ([id])
GO

ALTER TABLE [dbo].[Issue] CHECK CONSTRAINT [FK_IssueUser]
GO