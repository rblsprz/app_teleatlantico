USE [support_languages]
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Employee](
	[EmployeeId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](25) NOT NULL,
	[FirstSurname] [nvarchar](30) NOT NULL,
	[SecondSurname] [nvarchar](30) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[IsSupervisor] [bit] NOT NULL,
	[SupervisorId] [int] NOT NULL,
	[CreateBy] [int] NOT NULL,
	[ModifyBy] [int] NULL,
	[CreateDate] [datetime] NOT NULL,
	[ModifyDate] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[EmployeeId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Employee]  WITH CHECK ADD  CONSTRAINT [Supervisor_FK] FOREIGN KEY([SupervisorId])
REFERENCES [dbo].[Employee] ([EmployeeId])
GO

ALTER TABLE [dbo].[Employee] CHECK CONSTRAINT [Supervisor_FK]
GO
---------------------------------------------------------------------------------------------------------
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[EmployeeService](
	[EmployeeId] [int] NOT NULL,
	[ServiceId] [int] NOT NULL,
	[CreateBy] [int] NOT NULL,
	[ModifyBy] [int] NULL,
	[CreateDate] [datetime] NOT NULL,
	[ModifyDate] [datetime] NULL,
 CONSTRAINT [Employee_Service_PK] PRIMARY KEY CLUSTERED 
(
	[EmployeeId] ASC,
	[ServiceId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[EmployeeService]  WITH CHECK ADD  CONSTRAINT [Employee_Service_FK1] FOREIGN KEY([EmployeeId])
REFERENCES [dbo].[Employee] ([EmployeeId])
GO

ALTER TABLE [dbo].[EmployeeService] CHECK CONSTRAINT [Employee_Service_FK1]
GO

ALTER TABLE [dbo].[EmployeeService]  WITH CHECK ADD  CONSTRAINT [Employee_Service_FK2] FOREIGN KEY([ServiceId])
REFERENCES [dbo].[Service] ([ServiceId])
GO

ALTER TABLE [dbo].[EmployeeService] CHECK CONSTRAINT [Employee_Service_FK2]
GO
---------------------------------------------------------------------------------------------------------
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Issue](
	[ReportNumber] [int] IDENTITY(1,1) NOT NULL,
	[Classification] [nvarchar](5) NOT NULL,
	[Status] [nvarchar](12) NOT NULL,
	[ReportDate] [datetime] NOT NULL,
	[ResolutionComment] [nvarchar](255) NOT NULL,
	[EmployeeId] [int] NULL,
	[SupervisorId] [int] NULL,
	[ServiceId] [int] NOT NULL,
	[CreateBy] [int] NOT NULL,
	[ModifyBy] [int] NULL,
	[CreateDate] [datetime] NOT NULL,
	[ModifyDate] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[ReportNumber] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Issue]  WITH CHECK ADD  CONSTRAINT [Employee_FK] FOREIGN KEY([EmployeeId])
REFERENCES [dbo].[Employee] ([EmployeeId])
GO

ALTER TABLE [dbo].[Issue] CHECK CONSTRAINT [Employee_FK]
GO

ALTER TABLE [dbo].[Issue]  WITH CHECK ADD  CONSTRAINT [Service_FK] FOREIGN KEY([ServiceId])
REFERENCES [dbo].[Service] ([ServiceId])
GO

ALTER TABLE [dbo].[Issue] CHECK CONSTRAINT [Service_FK]
GO

ALTER TABLE [dbo].[Issue]  WITH CHECK ADD  CONSTRAINT [Supervisor_FK2] FOREIGN KEY([SupervisorId])
REFERENCES [dbo].[Employee] ([EmployeeId])
GO

ALTER TABLE [dbo].[Issue] CHECK CONSTRAINT [Supervisor_FK2]
GO
---------------------------------------------------------------------------------------------------------
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Notes](
	[NotesId] [int] IDENTITY(1,1) NOT NULL,
	[Description] [nvarchar](100) NOT NULL,
	[NoteDate] [datetime] NOT NULL,
	[ReportNumber] [int] NOT NULL,
	[EmployeeId] [int] NULL,
	[CreateBy] [int] NOT NULL,
	[ModifyBy] [int] NULL,
	[CreateDate] [datetime] NOT NULL,
	[ModifyDate] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[NotesId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Notes]  WITH CHECK ADD  CONSTRAINT [Employee_FK2] FOREIGN KEY([EmployeeId])
REFERENCES [dbo].[Employee] ([EmployeeId])
GO

ALTER TABLE [dbo].[Notes] CHECK CONSTRAINT [Employee_FK2]
GO

ALTER TABLE [dbo].[Notes]  WITH CHECK ADD  CONSTRAINT [Report_FK] FOREIGN KEY([ReportNumber])
REFERENCES [dbo].[Issue] ([ReportNumber])
GO
---------------------------------------------------------------------------------------------------------
ALTER TABLE [dbo].[Notes] CHECK CONSTRAINT [Report_FK]
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Service](
	[ServiceId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](20) NOT NULL,
	[CreateBy] [int] NOT NULL,
	[ModifyBy] [int] NULL,
	[CreateDate] [datetime] NOT NULL,
	[ModifyDate] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[ServiceId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[Name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO