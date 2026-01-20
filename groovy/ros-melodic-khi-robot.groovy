node {
    git url: 'https://github.com/Kawasaki-Robotics/khi_robot.git', branch: 'master'
    registerROS('ros:melodic-desktop-full', [
        'libopenblas-dev',
        'ros-melodic-joint-trajectory-controller',
        'ros-melodic-moveit-commander',
        'ros-melodic-moveit-core',
        'ros-melodic-moveit-planners',
        'ros-melodic-moveit-ros-move-group',
        'ros-melodic-moveit-ros-planning-interface',
        'ros-melodic-moveit-simple-controller-manager'
    ], [])
}
